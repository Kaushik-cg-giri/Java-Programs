/* Filter and Print Even Numbers Using Streams
Problem Statement:

Given a list of integers, use Java 8 streams and lambda expressions to:

Filter only even numbers.

Square those even numbers.

Print each squared number.
*/
package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterPrintEventNumbers {
	
	public static void main(String[] args) {
		

	
	List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
	
						list.stream()
							.filter(i->i%2==0)
							.map(i->i*i)
							.forEach(i->System.out.println(i));

	}
}
