class characterCount{
	public static void main(String args[]){
		String s ="The best of both worlds";
		char[] array = s.toCharArray();
		int length= s.length();
		int count =0;
		for(int i=0; i<length; i++){
			if(array[i]!=' '){
				count++;
			}
		}
		System.out.println("No of Characters :"+ count);
	}
}
