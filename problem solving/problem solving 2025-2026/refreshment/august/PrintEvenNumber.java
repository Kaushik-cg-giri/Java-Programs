package refreshment.august;

import java.util.Arrays;

public class PrintEvenNumber {

	public static void main(String[] args) {

		int[] arr = new int[] {1,2,3,4,5,6,7,8,9};
		
		Arrays.stream(arr)
			.filter(i->i%2==0)
			.forEach(i->System.out.println(i));
	}

}
