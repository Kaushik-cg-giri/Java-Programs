package refreshment.august;

// reverse accordoing to words
//expect o/p : script python java
public class ReverseWordString {

	public static void main(String[] args) {

		String str ="java python script";
		
		String[] arr = str.split(" ");
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=arr.length-1; i>=0 ;i--) {
			sb.append(arr[i]);
			sb.append(" ");
		}
		
		System.out.println(sb);
	}

}
