package refreshment.august;

public class ReverseString {

	public static void main(String[] args) {

		String str = "Us India";
		
		StringBuilder sb = new StringBuilder(str);
		
		sb.reverse();
		
		System.out.println(sb);
	}

}
