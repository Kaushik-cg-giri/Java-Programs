package refreshment_on_augest;

import java.util.HashMap;
import java.util.Map;

public class CountCharacterString {

	public static void main(String[] args) {

		String str ="java coount ja";
		
		Map<Character,Integer> map = new HashMap<Character, Integer>();
		
		char[] arr = str.toCharArray();
		int count =0;
		
		
		for(Character ch : arr) {
			
			//get the key value from the map
			//if there is no value for key then give default value as 0
			count = map.getOrDefault(ch,0);
			
			//upadte the map 
			map.put(ch, count+1);
		}
		
		for(Map.Entry<Character, Integer> itr:map.entrySet()) {
			System.out.println(itr.getKey()+":"+itr.getValue());
		}
	}

}
