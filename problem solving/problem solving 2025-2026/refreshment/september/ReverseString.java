package refreshment.september;

public class ReverseString {

	public static void main(String[] args) {

		String str ="Welcome to this ** world";
		
		StringBuffer reverseStr = new StringBuffer(str);
		
		System.out.println("print string after passing to stringBuffer : " + reverseStr);
		
		reverseStr.reverse();
		
		System.out.println("Print string after reversing : " + reverseStr);
		
		
	}

}
