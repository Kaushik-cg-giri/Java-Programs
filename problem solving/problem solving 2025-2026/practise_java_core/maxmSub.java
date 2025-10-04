package practise_java_core;
//SWliding Wndow program pattern

/*Find the maximum sum of a subarray of size k.

Array: [2, 1, 5, 1, 3, 2]
k = 3
Answer: 9 (subarray [5,1,3])*/

import java.util.Scanner;

public class maxmSub{

public static void main(String[] args){
  	int[] arr = new int[]{2, 1, 5, 1, 3, 2};
	int[] js = new int[3];
	Scanner sc = new Scanner(System.in);
	System.out.println("input subarray limit");
 	int k=sc.nextInt();
	maxmSub sub = new maxmSub();
	 js =sub.maxmSumSub(arr,k);
	
	for(int i=0; i<js.length;i++){
	System.out.println(js[i]);
	}
}

public int[] maxmSumSub(int[] arr, int k){

	int sum=0;
	int[] newArr = new int[k];
	int temp=0;
	 
	for(int i=0;i<arr.length;i++){
			sum=0;
			
			//if subarray reach out of position break from loop
			if(i+k-1 > arr.length-1){
				break;
			}
			
			//find sum of subarray having k elemnts
			for(int j=i;j<i+k;j++) {
				//sum=arr[i]+arr[i+1]+arr[i+2];
				sum += arr[j];
			}	
			
			//if sum greater than saved sum store it in new array
			if(sum>temp){
				temp =sum;
			
			for(int j=0;j<k;j++) {
				newArr[j] = arr[i+j];
			}

		}

	}
		return newArr;
  }

}
