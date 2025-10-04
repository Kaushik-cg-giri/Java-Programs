package practise_java_core;

public class ShiftZeroEnd {

	public static void main(String[] args) {

		int[] arr = {0, 1, 0, 3, 12};
		int n =arr.length;
		
		int[] arr2 = shiftZeroArrayEnd(arr,n);
		
		for(Integer i :arr2)
			System.out.println(i);
	}

	private static int[] shiftZeroArrayEnd(int[] arr, int n) {
		
		int[] arr1 = new int[n];
		int index =0;
		for(int i=0;i<n;i++) {
			
			if(arr[i]!=0) {
				arr1[index]=arr[i];
				index++;
			}
		}
		
		while(index<n) {
			arr1[index]=0;
			index++;
		}
		
		return arr1;
		
	}
}