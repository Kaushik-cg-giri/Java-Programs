package refreshment_on_augest;

public class AddingTwoNumber {

	public static void main(String[] args) {

		int[] arr = new int[] {1,5,7,9,4};
		
		int sum =0;
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j =i; j<arr.length;j++) {
				
				sum =arr[i]+arr[j];
				
				if(sum==12) {
					System.out.println("index are:");
					System.out.println(i+" "+j);
				}
				
			}
								
		}
	} 

}
