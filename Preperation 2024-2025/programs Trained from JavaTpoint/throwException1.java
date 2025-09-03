//print throw exception program1

class throwException1{
	
	public static void main (String[] args){
		{
			throwException1 obj= new throwException1();
			try{
			obj.first();
			}
			catch(ArithmeticException e){
			System.out.println("ended program1");
			}
		}
	}
	public void first()throws ArithmeticException{
		second();
	}
	
	public void second()throws ArithmeticException{
		throw new ArithmeticException("exception1");
	}
	
}