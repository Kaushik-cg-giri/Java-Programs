//program to count vowels and consonants
import java.util.Scanner;
class vowels{

	public static void main(String args[]){
		System.out.print("entr the string");
		//Scanner sc=new Scanner(System.in);
		String str="This is a really simple sentence";
		int flag1=0,flag2=0;
		String lower=str.toLowerCase();
		
		for(int i=0;i<lower.length();i++){
			
			if(lower.charAt(i)=='a'||lower.charAt(i)=='e'||lower.charAt(i)=='i'||lower.charAt(i)=='o'||lower.charAt(i)=='u')
				flag1++;
			else
				flag2++;
			
		}
		System.out.println("no of vowels "+flag1);
		System.out.println("no of consonants "+flag2);
	}
}	