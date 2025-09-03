class duplicateCharacter{
	public static void main(String[] args){
	String str = "kskjs";
	char[] array = str.toCharArray();
	char duplicate =0;
	for(int i=0; i<str.length();i++){
		for(int  j =i+1;j<str.length();j++){
			if(array[i] == array[j]){
				duplicate = array[i];
			}
		}
	}
	System.out.println("Duplicate character :"+ duplicate);
	}
}
