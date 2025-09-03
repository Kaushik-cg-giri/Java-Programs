class OneArryToAnother{
	public static void main(String[] args){
		int[] array = new int[] {1,2,3,4,5};
		int[] array1 = new int[array.length];
		int j=0;
		for(int i=0;i<array.length;i++){
			array1[j] = array[i];
			j++;
		}
		System.out.println("print copied array");
		for(int k=0;k<array.length;k++){
			System.out.println("elemnts :"+array1[k]);
			System.out.println(array.length);
		}
	}
}
