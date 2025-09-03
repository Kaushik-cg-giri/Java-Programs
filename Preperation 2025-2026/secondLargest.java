class secondLargest{
	public static void main(String[] args){
		int[] arr =new int[]{23,78,12,99,33};
		int largst = arr[0];
		int temp =0;
		for(int i=1; i<arr.length; i++){
			if(arr[i]>largst){
				temp = largst;
				largst = arr[i];
			}
		}
		System.out.println("Second largest number "+temp);
	}
}
