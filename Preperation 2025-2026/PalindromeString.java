class PalindromeString{
	public static void main(String[] args){
		String str = "ksk1";
		char[] array = str.toCharArray();
		char[] reverse = new char[str.length()];
		int j=0;
		for(int i=str.length()-1; i>=0; i--){
			reverse[j] = array[i];
			j++;
		}
		String reverseString = new String(reverse);
		if(str.equals(reverseString)){
			System.out.println("palindrome string :"+ reverseString);
		}
		else{
			System.out.println("String is not palindrome");
		}
	}
}
