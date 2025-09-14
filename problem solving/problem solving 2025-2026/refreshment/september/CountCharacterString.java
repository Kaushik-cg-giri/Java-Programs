package refreshment.september;

import java.util.HashMap;
import java.util.Map;

//WAP to count no of charactrers in sentence

public class CountCharacterString {

	public static void main(String[] args) {

		String str = "malayalam";
		
		Map<Character,Integer> map = new HashMap<Character, Integer>();
		
		char[] arr =str.toCharArray();
		
		int count;
		
		for(Character i : arr) {
			
			count = map.getOrDefault(i,0);
			map.put(i, count+1);
		}
		System.out.println("character count in sentence");
		
		for(Map.Entry<Character, Integer> m:map.entrySet()) {
			
			System.out.println(m);
		}
	}

}
