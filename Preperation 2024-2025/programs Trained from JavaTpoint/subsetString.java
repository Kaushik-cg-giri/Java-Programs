//program to display all the subset of string

class subsetString{
	public static void main(String args[]){
		
		String str= "sun";
		int len=0;
		len= str.length();
		//System.out.println(len);
		int subLen;
		subLen = (len*(len+1))/2;
		//System.out.println(subLen);
		String[] subStr= new String[subLen];
		String temp;
		int c=0;
		
		for(int i=0;i<len;i++){
		
			for(int j=i;j<len;j++){
				
				temp = str.substring(i,j+1);//substring takes from starting position to ending position but not display element in ending position
				
				subStr[c] = temp;
				
				c++;
			}
		}
		System.out.println("all subset are");
	
		for(int i=0;i<subLen;i++){
		System.out.println(subStr[i]);
		}
	}
}	
	
	