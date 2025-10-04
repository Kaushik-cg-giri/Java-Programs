package practise_java_core;
public class Problem3 {
	
	public static void main(String[] args) {
		
		int[] arr = {12, 35, 34, 10, 21, 1};
		int temp=0;
		int secondLargst=0;
		
		for(int i=0 ; i<arr.length; i++) {
			if(arr[i]>temp) {
				temp = arr[i];
				
			}	
		}
		
		for(int j=0 ; j<arr.length; j++) {
			if(arr[j]>secondLargst && arr[j]!=temp)
				secondLargst=arr[j];
		}
		
		System.out.println("second largest  "+secondLargst);
	}

}
