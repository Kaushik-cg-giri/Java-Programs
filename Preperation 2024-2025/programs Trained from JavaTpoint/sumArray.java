//program to print sum of all elements in array

class sumArray{

	public static void main(String[] args){
	
		int[] arr = {23,2,1};
		int sum=0;
		
		for(int i=0;i<arr.length;i++){
			
			sum=sum+arr[i];
		
		}
		
		System.out.println("sum of entire array "+sum);
	}
}	