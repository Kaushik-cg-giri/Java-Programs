package java8.map_vs_flatmap;

import java.util.List;
import java.util.stream.Collectors;

//Comparison between Map() vs FlatMap()
public class ComparisonMapVsFlatMap {

	public static void main(String[] args) {

		List<Student> list = StudentDB.getAllStudents();
		
		//Map()
		//Process of stram Values
		//It does only do mapping
		//produces single value for each I/P
		
		//get all the list name from StudentDB
		List<String> names = list.stream().map(Student::getName)
										 .collect(Collectors.toList());
		
		System.out.println("Displaying List of names: \n "+names);
		
		//flatMap()
		//process stream of stream values
		// it do mapping and flattening
		//produce multilpe values for each ip
		
		List<List<Integer>> PhnNoList = list.stream().map(Student::getPhnNo)
										   .collect(Collectors.toList());
		
		System.out.println("List contain List of Phone Numbers : \n "+PhnNoList);
		//here list contain another list 
		//actually we need to get all phone nos from db
		
		
		//So we need to use flatMap()
		
		List<Integer> phnNo = list.stream().flatMap(t ->t.getPhnNo().stream() )
										   .collect(Collectors.toList());
		
		System.out.println("List of Phone Numbers : \n "+phnNo);
		
	}

}
