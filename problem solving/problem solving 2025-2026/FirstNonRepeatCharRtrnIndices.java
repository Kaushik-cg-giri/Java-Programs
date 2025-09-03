import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatCharRtrnIndices {

	public static void main(String[] args) {

		String str ="aabb";
		
		int indice = firstNonRepeatinCharacter(str);
		System.out.println(indice);
	}

	private static int firstNonRepeatinCharacter(String str2) {

		Map<Character,Integer> map =new HashMap<Character, Integer>();
		
		char[] arr = str2.toCharArray();
		
		int value=0;
		
		for(int i=0; i<arr.length;i++) {
			
			map.put(arr[i], map.getOrDefault(arr[i],0)+1);			
		}
		
		for(int i=0;i<arr.length;i++) {
			value=map.get(arr[i]);
			if(value==1)
				return i;

		}
			
		return -1;
	}

}
 