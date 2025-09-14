package refreshment.august;

import java.util.HashMap;
import java.util.Map;

public class CountWordString {

	public static void main(String[] args) {

		String str ="java python java";
		
		String[] sb = str.split(" ");
		
		Map<String,Integer> map = new HashMap<String, Integer>();
		int count=0;
		
		for(String st : sb) {
			
			count = map.getOrDefault(st,0);
			
			map.put(st, count+1);
		}
		
		for(Map.Entry<String, Integer> ent : map.entrySet()) {
			System.out.println(ent.getKey()+":"+ent.getValue());
		}
	}

}
