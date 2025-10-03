package refreshment.september;

import java.util.Arrays;
import java.util.List;

public class PrintEvenNumber {

	public static void main(String[] args) {

		List<Integer> set = Arrays.asList(45,23,12,0,23,16,100);
		
		System.out.println("Printing  even Numbers in list");
		
		set.stream()
			.filter(i -> i%2==0)
			.forEach(System.out::println);
	}

}
