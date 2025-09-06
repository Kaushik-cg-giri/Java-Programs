import java.util.ArrayList;

public class RottatingArray {

	public static void main(String[] args) {

		int[] arr = {1,2,3,4,5,6,7};
		int k = 3;
		int temp;
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		//adding arry elemnt to ArrayList
		for(int i=0;i<arr.length; i++) {
			list.add(arr[i]);
			
		}
		
		//add the first elemnt from list to temp veriable
		//remove first elemnt from list
		//add last tolist
		for(int i=0;i<k;i++) {
			temp = list.get(0);
			list.remove(0);
			list.add(temp);
		}
		
		//converting list to array
		Integer[] rottated = list.toArray(new Integer[0]);
		for(Integer itr : rottated)
			System.out.println(itr);
	}

}
