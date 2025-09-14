package refreshment.august;
//expected op : ++c nohtyp avaj
public class ReverseStringExpectedOPGiven {

	public static void main(String[] args) {

		String str = "java python c++";
		
		//String[] arr = str.split(" ");
		
		StringBuilder sb = new StringBuilder(str);
		
		sb.reverse();
		sb.append(" ");
		
		System.out.println(sb);
	}

}
