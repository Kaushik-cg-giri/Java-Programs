//Find largest an smallest in array
class LgeSmlArray {
    public static void main(String[] args) {
      int[] arr = new int[]{21,42,13,84,76};
      
      array(arr);
      
    }
    public static void array(int[] arr){
        int temp=0;
        int small=0;
        small=arr[0];
        for(int i=0; i<arr.length; i++){
           for(int j=1;j<arr.length;j++){
            if(arr[j]>arr[i])
                temp=arr[j];
            if(arr[j]<small)
                small=arr[j];
           }
        }      
        System.out.println("largest elemnt "+temp);
        System.out.println("smallest elemnt "+small);
    }
}