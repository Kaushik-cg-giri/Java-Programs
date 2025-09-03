package refreshment_on_augest;

import java.util.ArrayList;
import java.util.List;

public class PrimeUsingStream {

	public static void main(String[] args) {

		int n=20;
		int c=0;
		
		List<Integer> list = new ArrayList<Integer>();
		
	for(int j=1;j<=20;j++) {
		
		for(int i=1;i<=20;i++) {
			
			if(j%i==0) {
				c=c+1;
			}
				
		}
		
		if(c==2)
			list.add(j);
		
		}
		System.out.println(list);
	}
	
}
