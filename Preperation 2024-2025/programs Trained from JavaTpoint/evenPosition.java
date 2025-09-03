//program to print even position element

class evenPosition{
	
	public static void main(String[] args){
		int arr[] = new int[]{12,29,22,2,8,56,2};
		
		for(int i=0;i<arr.length;i++){
			
			if(i%2!=0){
				
				System.out.println(arr[i]);
			}
		}
	}
}	