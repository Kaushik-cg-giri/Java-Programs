//program to find punctuations ina string

class panctuations{
	
	public static void main(String[] args){
		
		String str="He said, 'The mailman loves you.' I heard it with my own ears.";
		int flag=0;
		
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)=='!'||str.charAt(i)=='.'||str.charAt(i)=='\''||str.charAt(i)=='-'||str.charAt(i)=='\"'||str.charAt(i)=='?'||str.charAt(i)==';'||str.charAt(i)==':'){
					flag+=1;
			}
		}
		System.out.print("no of characters"+flag);
	}	
}