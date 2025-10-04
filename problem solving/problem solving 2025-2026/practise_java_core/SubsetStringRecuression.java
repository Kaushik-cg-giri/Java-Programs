package practise_java_core;

public class SubsetStringRecuression {

	public static void main(String[] args) {

		String str ="abc";
		char[] arr = str.toCharArray();
		int n = str.length()-1;
		String str1 =subStringSet(arr,n);
		
	}

	private static String subStringSet(char[] arr,int n) {

		if(n<0)
			return  "";
		
		System.out.println(subStringSet(arr,n));
		return null;
	}

}
