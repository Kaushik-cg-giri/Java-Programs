//program to print lowr case to upper case and vise versa

class lowrUpper{
	
	public static void main(String[] args){
		
		String str="My NamE Is KauSHik";
		String[] s2=new String[str.length()];
		String s3;
		//char[] temp=new char[str.length()];
		char[] array=str.toCharArray();
		
		for(int i=0;i<str.length();i++){
			char ch=array[i];
			if(Character.isUpperCase(array[i]))
				array[i]=Character.toLowerCase(ch);
			else
				array[i]=Character.toUpperCase(ch);
		}
		
		System.out.println(new String(array));
	}
}	
		