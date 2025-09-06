package most_repeated_interview_qstn;
import java.util.HashMap;
import java.util.Map;

public class checkAnagramOrNot {
	
	
	public static void main(String[] args) {
		
		String s1 = "listen";
		String s2 = "silens";
		
		Map<Character,Integer> map1 =new HashMap<Character,Integer>();
		Map<Character,Integer> map2 =new HashMap<Character,Integer>();
		
		if(s1.length() != s2.length()) {
			System.out.println("length different");
			return ;
		}
			
		
		for(Character ch : s1.toCharArray()) {
			map1.put(ch, map1.getOrDefault(ch,0)+1);
		}
		
		for(Character ch: s2.toCharArray()) {
			map2.put(ch, map2.getOrDefault(ch,0)+1);
		}
		
		if(map1.equals(map2))
			System.out.println("anagram ");
		else
			System.out.println("not anagram");
		
		
	}

}
