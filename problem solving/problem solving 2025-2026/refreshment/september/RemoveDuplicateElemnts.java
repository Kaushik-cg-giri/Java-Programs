package refreshment.september;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicateElemnts {

	public static void main(String[] args) {

		List<Integer> listNumber = Arrays.asList(100,98,23,45,7,100,45);
		
		System.out.println("Print list without duplicate elemnts");
		
		listNumber.stream()
					.distinct()
					.forEach(System.out::println);
	}

}
