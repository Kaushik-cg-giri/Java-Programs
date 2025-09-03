//program to find palindrome

class palindrome{
	
	public static void main(String args[]){
		
	int num=131,rev=0,rem;
	int temp=num;
	
	while(num>0){
		rem=num%10;
		rev=(rev*10)+rem;
		num=num/10;
	}
		if(rev==temp)
			System.out.print("number is palindrome");
		else
			System.out.print("number is not palindrome");
	}
}	