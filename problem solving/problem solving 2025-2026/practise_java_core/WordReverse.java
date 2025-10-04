package practise_java_core;

public class WordReverse {

	public static void main(String[] args) {

		String str ="Hello Java";
		String[] str1 = str.split(" ");
		reverseString(str1);
	}

	private static void reverseString(String[] str1) {

		StringBuffer sb = new StringBuffer();
		//String str3 = new String();
		char[] arr2 = new char[20];
		int k=0;
		
		for(int i=0;i<str1.length;i++) {

			char[] arr1 = str1[i].toCharArray();
			for(int j=arr1.length-1;j>=0;j--) {
				arr2[k] = arr1[j];
				k++;
			}
			String str2 = new String(arr2);
			sb.append(str2);
		}
		System.out.println(sb);
	}

}
