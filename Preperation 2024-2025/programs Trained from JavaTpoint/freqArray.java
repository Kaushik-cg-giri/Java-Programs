//program to find freqency of an array


class freqArray{
	
	public static void main(String[] args){
		
		int[] arr1={1,2,3,2,3,5,1,2};
		
		int freq=1;
		
		int[] temp=new int[arr1.length];
		int c=0;
		
		
		for(int i=0;i<arr1.length;i++){
				
			for(int j=i+1; j<arr1.length;j++){
				if(arr1[i]==arr1[j]){
					temp[c]=arr1[i];
					freq+=1;
					c++;
				}
			}
		}
		
		System.out.println("repeating array elaments");
		for(int i=0;i<c;i++){
			System.out.println(temp[i]);
		}	
			
	}
}	