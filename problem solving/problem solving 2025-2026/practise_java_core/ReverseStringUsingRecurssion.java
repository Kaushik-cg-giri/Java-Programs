package practise_java_core;

/*
 Coding Challenge: Recursion Without Loops
Problem:
Write a recursive Java method to reverse a given string without using loops or in-built reverse functions.

Example:
Input: "hello"
Output: "olleh"

Constraints:

No for, while, or do-while loops.

Must use recursion only.
 */
public class ReverseStringUsingRecurssion {

	public static void main(String[] args) {

		String name ="hello";
		int length = name.length();
		char[] arr1 = name.toCharArray();
		
		String str = reverseString(arr1,length-1);
		System.out.println("reverse String "+str);
		
	}

	private static String reverseString(char[] str, int n) {
		String str1;

		if(n<0)
			return "";
		else 
			str1= str[n]+reverseString(str, n-1);
		return str1;
		
	}

}
