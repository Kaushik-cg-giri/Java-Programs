class RemoveDuplicate{
	public int[] duplicate(int[] arr) {
		
		int visited =-1;
		for(int i=0; i<arr.length; i++){
			for(int j = 1+1; j<arr.length; j++){
				if(arr[i]==arr[j]){
					arr[j] = visited;
				}
			}
		}
		return arr;
	}
	public static void main(String[] args){
		int[] arr = {4,32,4,32,5};
		RemoveDuplicate dup = new RemoveDuplicate();
		int[] arr1 = dup.duplicate(arr);
		System.out.println("Elemnts After Removing");
		for(int i=0;i<arr1.length; i++){
			if(arr[i] != -1){
				System.out.print(arr1[i]+" ");
			}
		}
	}
}
