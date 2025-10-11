package refreshment.september;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class StudentOperation {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		List<Student> listStudent = Arrays.asList(new Student(101,"Raj","Kochi",Arrays.asList(new Subject(11,"Maths",76)))
												,new Student(102,"Appu","calicut",Arrays.asList(new Subject(19,"physics",99),new Subject(21,"English",86),new Subject(26,"Malayalam", 65)))
												,new Student(101,"Raj","Kochi",Arrays.asList(new Subject(11,"Maths",76),new Subject(88,"English",33)))
												,new Student(106, "loki", "chennai", Arrays.asList(new Subject(6,"chemstriy",49))));
		

		System.out.println("select required operation number");	
		System.out.println("for iterating list student press 1");
		System.out.println("for iterate list of subject press 2");
		System.out.println("for iterate list of subject mark greater than 50 press 3");
		System.out.println("for iterate list of student name where subject mark greater than 50 press 4");
		
		int n = sc.nextInt();
		
		if(n==1)
			iterateListOfStudent(listStudent);
		if(n==2)
			iterateListOfSubject(listStudent);
		if(n==3)
			iterateListOfSubjectGrtr50(listStudent);
		if(n==4)
			iterateListOfStudNamewhereSubMarkGrtr50(listStudent);
		
	}

	private static void iterateListOfStudNamewhereSubMarkGrtr50(List<Student> listStudent) {

		listStudent.stream()
					.flatMap(i -> i.getStdSubject().stream()  //flatmap student to subject // student annotante by i it represt all fields 
					.filter(j -> j.getSubMark()>50) // j annotate subject object it containb all subject fields
				    .map(j-> i.getStdName())) // map subject object to suden fiel namne // j ->subject object , i.getName()->student object maps
				    .forEach(System.out::println);
	}

	private static void iterateListOfSubjectGrtr50(List<Student> listStudent) {

		listStudent.stream()
					.flatMap(i -> i.getStdSubject().stream()
					.filter(j -> j.getSubMark()>50))
					.forEach(System.out::println);
	}

	private static void iterateListOfSubject(List<Student> listStudent) {

		listStudent.stream()
					.flatMap(i -> i.getStdSubject().stream())
					.forEach(System.out::println);
	}

	private static void iterateListOfStudent(List<Student> listStudent) {
		
		//iterate listStudent
		listStudent.forEach(System.out::println);
	}

}
