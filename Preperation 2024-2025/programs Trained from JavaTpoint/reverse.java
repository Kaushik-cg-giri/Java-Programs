class reverse{
	public static void main(String[] args){
		String str = "Hello World";
		String[] arr =str.split(" ");
			char[]  rev=new char[str.length()];
			int k=0;
			for(int i=0;i<arr.length;i++){
				for(int j=arr[i].length()-1;j>=0;j--){
					rev[k]=arr[i].charAt(j);
					k++;
				}
				rev[k]=' ';
			}
			String revArr = new String(rev);
			System.out.println(revArr);
	}
}	