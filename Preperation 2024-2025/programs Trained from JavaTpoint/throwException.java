//program to throw exception

class throwException{

	public static void main(String[] args){
		int x=10,n=0;
		try{
			division(10,0);
		}
		catch(ArithmeticException e){
			System.out.println(e.getMessage());
		}
	}

	public static void division(int x,int y){
		if(10/0==0)
			throw new ArithmeticException("not divisible");
	}
}	