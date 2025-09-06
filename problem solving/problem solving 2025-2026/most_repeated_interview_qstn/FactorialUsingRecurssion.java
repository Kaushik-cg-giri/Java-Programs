package most_repeated_interview_qstn;

public class FactorialUsingRecurssion {

	public static void main(String[] args) {

		int n =4;
		
		int fact =factorial(n);
		System.out.println("fatorial of "+ n +" number "+ fact );
	}

	private static int factorial(int n) {
		
		if(n==0)
			return 1;
		else
			return n*factorial(n-1);
		
		
	}

}
