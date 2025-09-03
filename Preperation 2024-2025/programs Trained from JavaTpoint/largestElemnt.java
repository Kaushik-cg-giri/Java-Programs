//print largest element in array

class largestElemnt{
	
	public static void main(String[] args){
		
		int[] arr= new int[]{23,12,4,7,87,2};
		int larg=arr[0];
		for(int i=1;i<arr.length;i++){
			
			if(arr[i]<larg)
				larg=arr[i];
			
		}
		
		System.out.println(larg);
	}	
}	