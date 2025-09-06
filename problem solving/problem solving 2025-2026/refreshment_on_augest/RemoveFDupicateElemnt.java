package refreshment_on_augest;

import java.util.Arrays;
import java.util.List;

public class RemoveFDupicateElemnt {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(55,78,55,12,3,12,9,55,3);
		
		list.stream()
			.distinct()
			.forEach(System.out::println);
	}

}
