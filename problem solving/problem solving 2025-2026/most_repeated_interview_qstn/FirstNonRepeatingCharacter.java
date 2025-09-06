package most_repeated_interview_qstn;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {

		String test = "aabcdbfcghijk";
		
		char[] arr =test.toCharArray();
		
		Map<Character,Integer> map = new HashMap<Character, Integer>();
		
		int count=0;
		
		for(int i =0;i<arr.length;i++) {
			
			count = map.getOrDefault(arr[i],0);
			map.put(arr[i], count+1);
		}
		
		//System.out.println(map);
		
		for(Map.Entry<Character, Integer> mp : map.entrySet()) {
			
			if(mp.getValue()==1) {
				System.out.println(mp.getKey());
				return;
			}
			
		}
	}
}
