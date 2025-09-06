package refreshment_on_augest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeSort {

	public static void main(String[] args) {

		Employee emp1 = new Employee(101,"Kiran",5000,"Finance");
		Employee emp2 = new Employee(102, "Ravi", 6000, "HR");
		Employee emp3 = new Employee(103, "Anita", 5500, "IT");
		Employee emp4 = new Employee(104, "Suresh", 7000, "Marketing");
		Employee emp5 = new Employee(105, "Kiran", 4800, "Sales");
		Employee emp6 = new Employee(106, "Vijay", 6200, "Operations");
		Employee emp7 = new Employee(107, "Priya", 5300, "Finance");
		Employee emp8 = new Employee(108, "Arun", 7500, "Research");
		Employee emp9 = new Employee(109, "Lakshmi", 5000, "Support");
		Employee emp10 = new Employee(110, "Rahul", 8000, "IT");
		
		List<Employee> empList = Arrays.asList(emp1,emp2,emp3,emp4,emp5,emp6,emp7,emp8,emp9,emp10);
		
		
		
		//sort according to name
		System.out.println( "Sort Employees according to  name");
		
		empList.stream()
				.sorted(Comparator.comparing(Employee::getName))
				.forEach(n -> System.out.println(n.getName()));
		
		//find out employee Kiran having salary 4800
		
		System.out.println("find out employee Kiran having salary 4800");
		
		empList.stream()
				.filter(n->n.getName().equals("Kiran") && n.getSalary()==4800 )
				.forEach(System.out::println);
		
		//Store Employees belong to It department in list
		
		System.out.println("Store Employees name belong to It department in list");
		
		List<String> names = empList.stream()
									.filter(n->n.getPosition().equals("IT"))
									.map(n->n.getName())
									.collect(Collectors.toList());
		
		names.forEach(System.out::println);
		

	}

}
