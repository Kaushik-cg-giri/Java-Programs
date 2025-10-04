package practise_java_core;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrintEvenStreamAPI {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
		
		list = list.stream().filter(n->n%2==0)
					 .collect(Collectors.toList());
		list.forEach(i->System.out.println(i));
	}

}
