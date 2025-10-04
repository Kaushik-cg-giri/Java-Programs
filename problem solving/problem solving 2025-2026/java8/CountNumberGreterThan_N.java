package java8;

import java.util.Arrays;
import java.util.List;

//Count numbers from list that greater than 10
public class CountNumberGreterThan_N {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(2,22,1,7,45,00,9,9);
		
		long count = list.stream()
							.filter(i -> i>10)
							.count();
		
		
		System.out.println("numbers greater than 10 : "+ count);

	}

}
