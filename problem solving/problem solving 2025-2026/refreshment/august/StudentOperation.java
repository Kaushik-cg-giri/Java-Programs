package refreshment.august;

import java.util.Arrays;
import java.util.List;

public class StudentOperation {

	public static void main(String[] args) {

		//Student object contain id,name and list subject details 
		List<Student> list = Arrays.asList(new Student(101,"Kiran",Arrays.asList(new Subject("Physics",90)))
							,new Student(102,"Ravi",Arrays.asList(new Subject("English",40),new Subject("Chemistry",80)))
							,new Student(101,"Kiran",Arrays.asList(new Subject("Physics",90))));
		
		//list.forEach(System.out::println);
		
		list.stream()
			.flatMap(i->i.getDetails().stream()
			.filter(j->j.getMark()>30)
			.map(j -> i.getName()))
			.distinct()
			.forEach(System.out::println);
		
	}

}