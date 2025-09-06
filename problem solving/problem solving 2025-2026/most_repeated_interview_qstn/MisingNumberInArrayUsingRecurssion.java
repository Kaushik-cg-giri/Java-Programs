// find out missing number
//not use for-loop
package most_repeated_interview_qstn;

public class MisingNumberInArrayUsingRecurssion {
	
	public static void main(String[] args) {
		
		int arr[]= {0,1,2,4,5};
		
		int length= arr.length;
		
		int expectedSum;
		
		expectedSum = length*(length+1)/2;
		
		int rsultedSum;
		rsultedSum= sumThroughIteration(arr,length-1);
		
		int missingNumbr  = expectedSum-rsultedSum;
		
		System.out.println("Missing Number "+missingNumbr);
                                                                                                                                                                                                                                                                                           	}

	private static int sumThroughIteration(int[] arr, int n) {
		
		int sum=0;
		
		if(n==0)
			return arr[0];
		
		else {
			int num = arr[n];
			sum= arr[n]+sumThroughIteration(arr, n-1);
		}
		
			
		return sum;
		
		
		
	}

}
