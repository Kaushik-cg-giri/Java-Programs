package refreshment.september;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindElmentStartWith_N {

	public static void main(String[] args) {

		List<String> elemnts = Arrays.asList("Hii","Name","jopker","niels");
		
		List<String> collection = elemnts.stream()
											.map(i -> i.toLowerCase())
											.filter(i ->i.startsWith("n"))
											.collect(Collectors.toList());
		
		System.out.println("elemnts start with n: "+collection);
 	}

}
