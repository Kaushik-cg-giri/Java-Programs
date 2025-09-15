package refreshment.september;

import java.util.HashMap;
import java.util.Map;

public class CountWordString {

	public static void main(String[] args) {

		String str ="lokh went to lokh";
		
		String[] arr = str.split(" ");
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		int count;
		
		for(String wrd : arr) {
			
			count =map.getOrDefault(wrd, 0);
			map.put(wrd, count+1);
		}
		
		System.out.println("No of words in String :"+ map);
	}

}
