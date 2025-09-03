class punctuationCouunt{

	public static void main(String[] args)
	{
	String str = "He said, 'The mailman loves you.' I heard it with my own ears.";
	int count = 0;
	char[] array= str.toCharArray();
		for(int i=0; i<str.length(); i++){
			if(array[i]=='!' || array[i]=='.' || array[i]=='\'' || array[i] =='-' || array[i] =='\"' || array[i] =='?' || array[i]==',' || array[i]==';'){
				count++;
		}
	 }
	
	System.out.println("No of punctuations : "+count);
     }  
}

