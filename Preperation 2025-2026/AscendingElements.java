class AscendingElements{
	public static void AscendingOrder(int[] arr){

		int temp;
		System.out.println("Norel order of array");
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}

		for(int i=0; i<arr.length; i++){
			for(int j= i+1; j<arr.length; j++){
				if(arr[i]>arr[j]){
					temp = arr[j];
					arr[j] =arr[i];
					arr[i] = temp;
				}
			}
		}
		System.out.println();
		System.out.println("Ascending order of array");
		for(int i=0; i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
	}
	public static void main(String[] args){
		int[] arrMain = new int[]{12,99,7,14,88};
		int[] arr2={45,1,7,77,65};
		AscendingOrder(arr2);
		}
}
