/*
 Problem Statement: Given an array of positive integers and a positive integer k,
find the minimum sum of any contiguous subarray of size k.
Array: [4, 2, 2, 7, 8, 1, 2, 8, 1, 0]
k = 3
✅ Minimum sum = 8
✅ Subarray = [4,2,2]
 */

import java.util.Scanner;

public class MinimSum {

	
	public static void main(String[] args) {
		
		int[] arr  = new int[] {4, 2, 2, 7, 8, 1, 2, 8, 1, 0};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of subarray");
		int k = sc.nextInt();
		
		MinimSum mini =  new MinimSum();
		
		int minimum =mini.minimSumSubarray(arr, k);
		System.out.println("Minimum sum that can be formed using subarray = "+ minimum);
	}
	
	public int minimSumSubarray(int[] arr, int k) {
		
		int windowSum=0;
		int minmSum=0;
		int sum=0;
		
		for(int i=0;i<k;i++) {
			windowSum += arr[i];
		}
		minmSum = windowSum;

		for(int i=k; i<arr.length; i++) {
			
			windowSum +=arr[i]-arr[i-k];
			minmSum = Math.min(minmSum,windowSum);
			
		}
		return minmSum;
	}
}
