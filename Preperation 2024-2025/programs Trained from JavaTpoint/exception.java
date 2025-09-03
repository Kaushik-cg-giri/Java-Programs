//program to check exception

class exception{
	public static void main(String args[]){
		int x=10,y=0,rslt;
		int[] arr= new int[3];
		try{
			System.out.println("try block started");
			rslt=x/y;
			
			System.out.println("try block ended");
		}
		
		catch(ArithmeticException e){
		System.out.println("entering catch block");
		System.out.println(e.getMessage());
		}
		
		try{
			arr[5]=10;
		}
		
		catch(Exception e){
			System.out.println("entering catch block");
			System.out.println(e.getMessage());
			System.out.println("exiting catch block");
		}

	}
}	