import java.util.HashMap;
import java.util.Map;

public class Nonrepetative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] values = { 2, 5, 2, 4, 5, 1, 4, 7, 3 };
		
		int k =0;
		
		Map<Integer,Integer> map = new HashMap<Integer, Integer>();
		
		int count=0;
		
		for(Integer i : values) {
			
			count = map.getOrDefault(i, 0);
			map.put(i, count+1);
			
			//System.out.println(map);
		}
		
		for(Integer i : values) {
			
			if(map.get(i)!=1) {
				
				if(k==0) {
				k=1;
				System.out.println(i+"="+map.get(i));
				}
			}
		}
	}

}
