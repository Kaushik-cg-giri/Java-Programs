package practise_java_core;

/*
 Given an array nums of n integers where 1 ≤ nums[i] ≤ n, some elements appear twice and others appear once.
  Find all the numbers from 1 to n that do not appear in nums.
  
  Input:  nums = [4,3,2,7,8,2,3,1]
Output: [5,6]

Input: nums = [1,1]
Output: [2]

 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LIstMissingNumber {

	public static void main(String[] args) {
		
		int[] arr = {4,3,2,7,8,2,3,1};
		List missingArr= new ArrayList<Integer>();
		int j=0;
		
		Set<Integer> set = new HashSet<Integer>();
		
		for(Integer i: arr)
			set.add(i);
		
		for(int i=1;i<=set.size();i++) {
			if(!set.contains(i)) {
				missingArr.add(i);
			}
		}

			System.out.println("Missing numbers are "+missingArr);
	}

}
