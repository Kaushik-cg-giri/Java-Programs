package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertUpperCaseJava8 {

	public static void main(String[] args) {

		List<String> input = Arrays.asList("java", "spring", "boot");
		
		List<String> output = input.stream()
									.map(n->n.toUpperCase())
									.collect(Collectors.toList());
		System.out.println("uppercase of input list"+ output);
	}

}
