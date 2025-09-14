package refreshment.september;

//WAP when adding f two number from array to get sum as 50 print number index
public class AddinTwoNumberIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {10,20,30,40};
		
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=i+1; j<arr.length; j++) {
				
				if(arr[i]+arr[j]==50) {
					System.out.println("Index are :"+i +"\n "+j);
					
				}
			}
		}

	}

}
