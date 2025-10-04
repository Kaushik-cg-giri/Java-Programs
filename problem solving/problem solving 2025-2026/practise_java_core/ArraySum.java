package practise_java_core;

import java.util.*;

class ArraySum {
    public static void main(String[] args) {

        int[] arr = {10, 20, 10, 0, 30, 15, 15, 5};
        int[] arr2 = new int[3];
        int visited =-1;
        int k=0;
        
        
        for(int i=0;i<arr.length;i++){
            List<Integer> list = new ArrayList<Integer>();
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==30){
                    list.add(arr[i]);
                    list.add(arr[j]);
                    arr[i]=visited;
                    arr[j]=visited;
                }
            }
            if(!list.isEmpty())
                System.out.println(list);
        }
        
    }
}
