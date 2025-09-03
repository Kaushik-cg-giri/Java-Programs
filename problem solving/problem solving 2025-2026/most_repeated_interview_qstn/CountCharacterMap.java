package most_repeated_interview_qstn;
import java.util.HashMap;
import java.util.Map;

public class CountCharacterMap {
	
public static void main(String args[]) {
	
	Map<Character,Integer> map = new HashMap<>();
	
	String str ="CountCharacterMap";
	char[] arr = str.toCharArray();
	
	int value =0;
	for(Character ch : arr) {
		
		value = map.getOrDefault(ch,0);
		map.put(ch,value+1);
		
	}
	
	System.out.println("Character count "+ map);
	
}

}
