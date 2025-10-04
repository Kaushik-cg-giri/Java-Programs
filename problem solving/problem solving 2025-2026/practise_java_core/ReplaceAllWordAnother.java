package practise_java_core;
//ZOHOO QSTN-1
/*
 Write a Java program to replace each substring of a given string that matches the given regular
expression with the given replacement.
Sample string : "The quick brown fox jumps over the lazy dog."
In the above string replace all the fox with cat.
 */
public class ReplaceAllWordAnother {

	public static void main(String[] args) {

		String str = "The quick brown fox jumps over the lazy dog.";
		String str1 = str.replace("fox", "cat");
		
		System.out.println(str1);
	}

}
