package refreshment_on_augest;

import java.util.Arrays;
import java.util.List;

public class FruitStartWithVowels {

	public static void main(String[] args) {

		List<String> fruits = Arrays.asList("apple","banana","jack fruit","avacado","orange");
		
									fruits.stream()
									.filter(n->n.startsWith("a") || n.startsWith("e") || n.startsWith("i") || n.startsWith("o"))
									.forEach(System.out::println);
	}

}
