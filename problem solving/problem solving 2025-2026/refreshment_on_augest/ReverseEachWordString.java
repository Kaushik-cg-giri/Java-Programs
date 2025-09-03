package refreshment_on_augest;

//expected op : avaj nohtyp ++c
public class ReverseEachWordString {

	public static void main(String[] args) {

		String str = "java python c++";
		
		String[] arr = str.split(" ");
		
		//StringBuilder sb = new StringBuilder();
		
		StringBuilder sp = new StringBuilder();
		
		
		for(String word : arr) {
		
			
			StringBuilder sb = new StringBuilder(word);
			sb.reverse();
			sp.append(sb);
			sp.append(" ");
			
		}
		
		System.out.println(sp);
	}

}
