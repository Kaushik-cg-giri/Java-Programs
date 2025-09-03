//program to divide string n equal parts
import java.util.Scanner;
class subStringN{

	public static void main(String args[]){
		
		String str="aabbbccccccd";
		
		System.out.println("enter the no of parts");
		//Scanner sc =new Scanner(System.in);
		int n=3,len;
		len=str.length()/n;
		String[] sub=new String[len];
		String temp;
		int size=0;
		System.out.println(str.length());
		if(str.length()%n!=0)
			System.out.println("string is not divisible by n parts");
		for(int i=0;i<str.length();i=i+len){
			temp =str.substring(i,i+len);
			sub[size]=temp;
			size++;
			System.out.println(i);
		}
		System.out.println("n equal parts");
		
		for(int i=0;i<n;i++){
			System.out.println(sub[i]);
		}	
	}
}	