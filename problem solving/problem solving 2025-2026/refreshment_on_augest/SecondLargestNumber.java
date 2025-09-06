package refreshment_on_augest;

import java.util.Arrays;

public class SecondLargestNumber {

	public static void main(String[] args) {

		int[] arr = new int[] {45,12,78,55,90};
		
		int largst =0;
		
		int scndLargst =0;
		
		for(Integer nmbr :arr) {
			
			if(nmbr>largst)
				largst=nmbr;
		}
		
		
		for(Integer nmbr :arr) {
			
			if(nmbr>scndLargst && nmbr!=largst)
				scndLargst = nmbr;
		}
		

		
		System.out.println("second largest number :"+scndLargst);
	}

}
