//Count no of characters in string

class noChar{
	public static void main(String args[]){
		String s1="The best of both worlds";
		int c=0;
		char[] ch=s1.toCharArray();
		
		for(int i=0;i<s1.length();i++){
			if(ch[i]!=' '){
				c+=1;
			}
		}
			System.out.print("no of characters are " +c);
	}
}