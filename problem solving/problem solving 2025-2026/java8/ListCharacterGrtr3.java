package java8;

import java.util.Arrays;
import java.util.List;

public class ListCharacterGrtr3 {

	public static void main(String[] args) {

		List<String> animals = Arrays.asList("cat","monkey","lion","elephant","dog","tiger","mouse","rabbit");
		
		animals.stream()
				.filter(i->i.length()>4)
				.forEach(System.out::println);
		
	}

}
