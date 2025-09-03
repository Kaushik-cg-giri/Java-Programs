package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StuentAgeGreater21 {

	public static void main(String[] args) {

		Student s1 = new Student("Ammer", 28,"KTM");
		
		Student s2 = new Student("Rafel",18 , "PTM");
		
		Student s3 = new Student("Kaushik", 30,"ALPY");
		
		List<Student> list = new ArrayList<Student>();
		
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		
		System.out.println("student list :"+list);
		
		List<Student> output = sortStudentAge(list);
		
		output.forEach(System.out::println);
		
		//System.out.println("Students age greater than 21 in ascending order "+output);
	}

	private static List<Student> sortStudentAge(List<Student> list) {
		
		List<Student> output = list.stream()
									.filter(student -> student.getAge()>=21)
									.sorted(Comparator.comparing(Student::getAge))
									.collect(Collectors.toList());
		return output;
	}

}
