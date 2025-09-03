 class vowelsCount{
	public static void main (String[] args){
	String str ="This is a really simple sentence";
	String lower = str.toLowerCase();
	char[] array = lower.toCharArray();
	int vowels =0;
	int constant=0;
	for(int i=0;i<str.length();i++){
		if(array[i] == 'a' || array[i] =='e' || array[i] =='i' || array[i] =='o' || array[i]=='u'){
			vowels++;
		}
		else if(array[i]!=' '){
			constant++;
		}
	}
	System.out.println("vowels count="+vowels);
	System.out.println("constant count="+constant);
	}
}
