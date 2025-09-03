class SumArray{
	public static void main(String[] args){
		int[] arr = new int[]{23,20,10,5,1};
		int sum =0;
		for(int i=0; i<arr.length;i++){
			sum=sum+arr[i];
		}
		System.out.println("Sum of elemnts in array "+ sum);
	}
}
