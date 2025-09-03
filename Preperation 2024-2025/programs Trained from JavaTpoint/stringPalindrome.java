//program to check string is palindrome or not
import java.util.* ;
import java.io.*; 

class stringPalindrome{
	
	public static void main(String[] args){
		
		Scanner sc= new Scanner(System.in);
		String str= sc.next();
		String lower =str.toLowerCase();
		
		char[] arr=lower.toCharArray();
		char[] newarr=new char[lower.length()];
		int size=0;
		
		for(int i=lower.length()-1;i>=0;i--){
			
			newarr[size]=arr[i];
			size++;
		}
		String newString=new String(newarr);
		
		System.out.println(newString);
		
		if(lower.equals(newString))
			System.out.println("string is palindrome "+newString);
		else
			System.out.println("Strng is not palindrome");
	}
}	
