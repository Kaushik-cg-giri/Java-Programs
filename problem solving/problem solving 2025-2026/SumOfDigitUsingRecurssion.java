
/*
 * Write a recursive Java method that returns the sum of the digits of a given non-negative integer.

Example:
Input: 1234
Output: 10 (1 + 2 + 3 + 4)

Input: 0
Output: 0
 */

public class SumOfDigitUsingRecurssion {

	public static void main(String[] args) {

		int n = 1234;
		int expectedSum=0;
		
		expectedSum = recurssionSum(n,expectedSum);
		System.out.println("expected sum= "+expectedSum);
	}

	private static int recurssionSum(int n,int sum) {
		
		if(n==0)
			return 0;
		
		else 
			sum+= n%10+recurssionSum(n/10,sum);
		return sum;
	}

}
