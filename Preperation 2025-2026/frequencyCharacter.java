
import java.util.*;
class frequencyCharacter{
	public static void main(String[] args){
	String str ="characterc";
	char[] array = str.toCharArray();
	int count =1;
	Map<Character,Integer> freq = new HashMap<Character, Integer>();
	for(int i=0; i<str.length(); i++){
		for(int j = i+1; j<str.length();j++){
			if(array[i]==array[j]){
				count++;
				array[j] ='0';
			 }
		  }
		freq.put(array[i],count);
			count=1;	
		}	
	System.out.println("frequecy of character :" +freq);
	}
}
