package refreshment.august;

import java.util.Arrays;
import java.util.List;

public class FindElemntStartWith1 {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(41,5,12,47,1);
		
		
		System.out.println("numbers starting with one");
		
		list.stream()
			.map(n-> n+"")
			.filter(n -> n.startsWith("1"))
			.forEach(n -> System.out.println(n));
		
	}

}
