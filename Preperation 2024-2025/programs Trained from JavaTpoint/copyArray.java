//program to copy array

class copyArray{

	public static void main(String[] args){
		
		int[] arr1=new int[]{1,2,3,4};
		
		int size=arr1.length;
		
		int[] arr2=new int[size];
		int j=0;
		
		for(int i=0;i<size;i++){
			arr2[j]=arr1[i];
			j++;
		}
		
		System.out.println("copied array arr2");
		for(int i=0;i<size;i++){
			System.out.println(arr2[i]);
		}	
	}
}	