package practise_java_core;

/*
 * Given an array of integers nums and an integer target, return the indices of the two numbers such that they add up to the target.
 *  You may assume each input has exactly one solution.
 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class IndcesTarget {

	public static void main(String[] args) {
		
		int[] arr = {2, 7, 11, 15};
		int target =17;
		
		List list=findTargetIndeces(arr,target);
		System.out.println("Required target sum "+list);
	}

	private static List findTargetIndeces(int[] arr, int target) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i =0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==target) {
					list.add(i);
					list.add(j);
				}
			}
		}
		return list;
	}

}
