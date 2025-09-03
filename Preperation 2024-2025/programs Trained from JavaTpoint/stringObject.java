//check string is mutable or not or position

class stringObject{
	public static void main(String args[]){
		String s1="xyz";
		String s2;
		String s3="";
		s1.toUpperCase();
		System.out.print(s1);
		//String s2=s1.replace('Y','q');
		//System.out.print(s2);
		s3=s1.substring(0,1);
		System.out.println(s3);
	}
}