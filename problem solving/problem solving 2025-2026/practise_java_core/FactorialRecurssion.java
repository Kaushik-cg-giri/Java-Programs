package practise_java_core;

public class FactorialRecurssion {

	public static void main(String[] args) {

		int n=5;
		int fat = factorial(n);
		System.out.println(fat);
	}

	private static int factorial(int n) {
	
		//int fact =1;
		if(n==1)
			return 1;
		
		return n *factorial(n-1) ;
	}

}
