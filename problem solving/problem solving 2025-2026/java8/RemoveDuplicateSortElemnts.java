package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateSortElemnts {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(5, 3, 2, 5, 3, 7, 1);
		
		//remove duplicate numbers and arrange ascending order
		List<Integer> outputAsc = numbers.stream()
									  .distinct()//remove duplicat numbers
									  .sorted()// sort default ascending order
									  .collect(Collectors.toList());
		
		System.out.println("Arrange Ascending Order "+outputAsc);
		//remove duplicate numbers and arrange in descending order
		
		List<Integer> outputDesc = numbers.stream()
										  .distinct()
										  .sorted(Comparator.reverseOrder())
										  .collect(Collectors.toList());
		
		System.out.println("Arrange in Descending Order "+outputDesc);
		

	}

}
