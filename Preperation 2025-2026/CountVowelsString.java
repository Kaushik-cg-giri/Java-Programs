import java.util.*;
class CountVowelsString{
	public static void main(String[] args){
	String str = "anaular";
	char[] array = str.toCharArray();
	int count =1;
	Map<Character,Integer> map = new HashMap<Character,Integer>();
	for(int i=0; i<str.length();i++){
		for(int j=0;j<str.length();j++){
			if(array[j]=='a' || array[j]=='e' || array[j] =='i' || array[j]=='o' ||array[j] =='u'){
				
				array[j]='0';
				map.put(array[i],count);
				count++;
			}
		}

		count=1;
	}
		System.out.println(map);
	}
}
