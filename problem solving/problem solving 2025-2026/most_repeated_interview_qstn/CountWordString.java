// no of words in string 

package most_repeated_interview_qstn;

import java.util.HashMap;
import java.util.Map;

public class CountWordString {
	

	public static void main(String[] args) {
		
		String test = "Hello Java Hello";
		
		CountWord(test);
	}

	private static void CountWord(String test) {

		String[] arr = test.split(" ");
		Map<String,Integer> map = new HashMap<String, Integer>();
		
		int count;
		
		for(String wrd : arr) {
			
			count = map.getOrDefault(wrd, 0);
			map.put(wrd,count+1);
			
		}
		
		System.out.println("word occurence : "+map );
	}

}
