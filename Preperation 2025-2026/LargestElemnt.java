class LargestElemnt{
	public static void main(String[] args){
	int[] arr = new int[]{20,40,60,1,80};
	int larg = arr[0];
	
	for(int i =1; i< arr.length;i++){
			if(arr[i]>larg){
				larg=arr[i];
			}
		}
	System.out.println("largets elent in an array "+ larg);
	}
}
