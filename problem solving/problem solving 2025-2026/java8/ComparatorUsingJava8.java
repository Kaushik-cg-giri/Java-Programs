package java8;

import java.util.Arrays;
import java.util.List;

public class ComparatorUsingJava8 {

	public static void main(String[] args) {
		
		System.out.println("java 8");

		List<Integer> list =Arrays.asList(45,78,65,85,5,21,7);
		
		list.sort((a,b)->a-b);
		
		System.out.println(list);
		
		List<String> list1 = Arrays.asList("zohoo","apple","pinaple","aaone");
		
		list1.sort((a,b)->a.compareTo(b));
		
		System.out.println("sort string list "+list1);
	}

}
