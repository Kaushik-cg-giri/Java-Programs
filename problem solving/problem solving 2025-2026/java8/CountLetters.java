/*
 🔹 Challenge: Count Words Starting with a Specific Letter
Problem Statement:

Given a list of words, use Java 8 streams to:

Filter all words that start with the letter "a" (case-insensitive).

Count how many such words exist.

Print the count.
 */
package java8;

import java.util.Arrays;
import java.util.List;

public class CountLetters {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("apple", "banana", "Avocado", "apricot", "cherry", "Almond");
		
		long count =  list.stream()
						.map(i->i.toLowerCase())
						.filter(j-> j.startsWith("a"))
						.count();
		System.out.println(count);
			
	}

}
