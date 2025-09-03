class ReverseArray{
	public static void main(String[] args){
		int[] arr = new int[5];
		arr[0] = 45;
		arr[1] = 10;
 		arr[2] = 18;
		arr[3] = 7;
		arr[4] = 21;

		System.out.println("array elemnts in inserted order :");
		for(int i=0; i<arr.length;i++){
			System.out.println(arr[i]);
		}

		System.out.println("array elemnts iun reverse order :");
		for(int j=arr.length-1;j>=0; j--){
			System.out.println(arr[j]);
		}
	}
}
