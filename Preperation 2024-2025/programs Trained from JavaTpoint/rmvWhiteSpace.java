//program to remove white space

class rmvWhiteSpace{

	public static void main(String[] args){
		
		
			
			String str = "Hi my name Kaushik";
			String temp="";
		
			
			for(int i=0;i<str.length();i++){
				if(str.charAt(i)==' '){
					temp =str.replace(" ","");
				}
			}
			
			System.out.println("string without space " +temp);
	}	
}	