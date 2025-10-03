package refreshment.september;

public class SecondLargestNumber {

	public static void main(String[] args) {

		int[] array = new int[] {12,45,23,55,99,10};
		
		int largst = array[0];
		
		int secondLargst = array[0];
		
		for(int i=1; i<array.length;i++) {
			
			if(array[i] > largst)
				
				largst=array[i];
			
		}
		
		System.out.println(" largest elemnt in list : " + largst);
		
		for(int i=1; i<array.length;i++) {
			
			if(array[i]>secondLargst && array[i] != largst )
				
				secondLargst = array[i];
		}
		
		System.out.println("Second largest element in list : "+ secondLargst);
	}

}
