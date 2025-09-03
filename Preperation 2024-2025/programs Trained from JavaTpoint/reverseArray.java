//program to reverse an array

 class reverseArray{
	 
	public static void main(String[] args){
		
		int[] arr= new int[]{12,25,12,9,0,10};
		int size= arr.length;
		reverse(arr,size);
	}

	public static void reverse(int[] arr1,int size){
	/*	int temp;
		for(int i=0;i<size;i++){
			if(i>size)
				break;
			temp=arr1[size];
			arr1[size]=arr1[i];
			arr1[i]=temp;
			size--;*/
		for(int i=size-1;i>=0;i--)
			System.out.println(arr1[i]);
		
			
	}	
 }