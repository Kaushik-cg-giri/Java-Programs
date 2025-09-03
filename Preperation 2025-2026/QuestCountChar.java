import java.util.*;
import java.util.Arrays;
class QuestCountChar{

	public static void main(String[] args){
		List<String> list = new ArrayList<String>(Arrays.asList("ab"," "," ","cd"," "));
		
		long cnt = list.stream().filter(i->i.equals(" "))
				.count();
		
		System.out.println(cnt);
		}
	}
