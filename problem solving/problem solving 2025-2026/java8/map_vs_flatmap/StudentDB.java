package java8.map_vs_flatmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StudentDB {
	
	public static List<Student> getAllStudents() {
		
		List<Student> list = new ArrayList<Student>();
		
		Student s1 = new Student(101, "Kiran", new ArrayList<Integer>(Arrays.asList(950000, 7500000)));
		Student s2 = new Student(102, "Amit", new ArrayList<Integer>(Arrays.asList(850000, 6400000)));
		Student s3 = new Student(103, "Neha", new ArrayList<Integer>(Arrays.asList(920000, 7100000)));
		Student s4 = new Student(104, "Ravi", new ArrayList<Integer>(Arrays.asList(780000, 6800000)));
		Student s5 = new Student(105, "Sneha", new ArrayList<Integer>(Arrays.asList(990000, 7300000)));
		Student s6 = new Student(106, "Manoj", new ArrayList<Integer>(Arrays.asList(810000, 6600000)));
		Student s7 = new Student(107, "Priya", new ArrayList<Integer>(Arrays.asList(870000, 7000000)));
		Student s8 = new Student(108, "Vikram", new ArrayList<Integer>(Arrays.asList(940000, 7600000)));
		Student s9 = new Student(109, "Divya", new ArrayList<Integer>(Arrays.asList(880000, 6900000)));
		Student s10 = new Student(110, "Arjun", new ArrayList<Integer>(Arrays.asList(930000, 7200000)));

		Collections.addAll(list,s1,s2,s3,s4,s5,s6,s7,s8,s9,s10);
		return list; 
	}

}
