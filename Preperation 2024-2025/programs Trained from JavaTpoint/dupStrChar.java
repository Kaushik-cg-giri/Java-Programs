
//duplicate character in string
class dupStrChar{
	public static void main(String[] args){
		String str = "kaukhak";
		int len =str.length();
		char[] arr = str.toCharArray();
		char[] arr1 = new char[len];
		
		int count=0,k=0;
		
		for(int i=0;i<len;i++){
			char temp =arr[i];
			for(int j=i+1;j<len;j++){
				
				if(arr[j]==temp){
					arr1[k]=temp;
					k++;
					arr[j]=0;
				}
			}
		}
		for(int i=0;i<arr1.length;i++){
			System.out.println(arr1[i]);
		}
	}
}	