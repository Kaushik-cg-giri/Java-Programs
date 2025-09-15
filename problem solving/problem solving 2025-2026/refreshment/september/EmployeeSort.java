package refreshment.september;

import java.security.DrbgParameters.NextBytes;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

//Create Employee 
//Sort employee required parameter

public class EmployeeSort {

	public static void main(String[] args) {

		System.out.println("sort employee according to name press 1\n"
				+ "sort employee according to section press 2 \n"
				+ "sort employee according to salary press 3");
		
		List<Employee> employees = Arrays.asList(new Employee(101, "Neli", "Finance", 5000),
				new Employee(202, "Vinod", "Administrator", 1000),
				new Employee(303, "Adam","IT", 2500));
		
		System.out.println("press number for sorting");
		
		Scanner sc = new Scanner(System.in);
		int nmbr = sc.nextInt();
		
		if(nmbr==1)
			sortName(employees);
		if(nmbr==2)
			sortSection(employees);
		if(nmbr==3)
			sortSalary(employees);
	}

	private static void sortSalary(List<Employee> employees) {

		employees.stream()
			.sorted(Comparator.comparing(Employee::getSalary))
			.forEach(i->System.out.println(i.getId()+" "+i.getName()+" "+i.getSection()+" "+i.getSalary()));
	}

	private static void sortSection(List<Employee> employees) {

		//print eployee section only
		employees.stream()
				.sorted(Comparator.comparing(Employee::getSection))
				.forEach(i->System.out.println(i.getSection()));
		
		//after secton sort print employee name
		System.out.println("after secton sort print employee name");
		employees.stream()
				.sorted(Comparator.comparing(Employee::getSection))
				.forEach(i->System.out.println(i.getName()));
	}

	private static void sortName(List<Employee> employees) {

		//print employee all details
		employees.stream()
				.sorted(Comparator.comparing(Employee::getName))
				.forEach(System.out::println);
	}

}
