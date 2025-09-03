//program to check longest repeating sequence in a string

class rptSubString{
	
	public static void main(String[] args){
		String str="kaushik is good boy kaushik studied in 5th class kaushik scored 100,he is good in maths";
		int len =str.length();
		int n=len*(len+1)/2;
		String[] newstr= new String[n];
		int post=0;
		
		for(int i=0;i<len;i++){
			for(int j=i;j<len;j++){
				newstr[post] =str.substring(i,j+1);
				post++;
			}
		}
		String temp = "";
		int c=0,maxlenth=0;
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				if(newstr[i].equals(newstr[j])){
					if(newstr[j].length()>maxlenth){
						maxlenth=newstr[j].length();
						temp=newstr[j];
						
					}	
				}
			}	
		}
		
			System.out.println("longest repeating sequence "+temp);
		
	}
}	