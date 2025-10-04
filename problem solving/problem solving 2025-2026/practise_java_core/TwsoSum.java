package practise_java_core;

import java.util.ArrayList;
import java.util.List;

public class TwsoSum {

	public static void main(String[] args) {

		int[] arr = {2, 7,11 , 15};
		int target =18;
		
		int[] result = twoSum(arr,target);
		
		System.out.println(result[0]+" "+result[1]);
	}

	private static int[] twoSum(int[] arr, int target) {

		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==target) {
					return new int[] {i,j};
				}
			}	
		}
		return null;
	}

}
