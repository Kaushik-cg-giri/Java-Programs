//program to find dupicate element in array

class duplicateArray{
	
	
	public static void main(String[] args){
	
		int[] arr= new int[]{1,66,23,66,6,1,1,1};
		int flag=0;
		int[] duplicate=new int[arr.length];
		int temp=0;
		
		for(int i=0;i<arr.length;i++){
				
			for(int j=i+1;j<arr.length;j++){
				
				if(arr[i]==arr[j]){
					
						duplicate[temp]=arr[i];
						temp++;
						break;
					
					}	
				}
					
			}
		
			
		System.out.println("repeating elements are");
			
		for(int i=0;i<temp;i++)
			System.out.println(duplicate[i]);
	}
}	
			