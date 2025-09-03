
//interface for java 8
interface LambdaExpressionJava8{
	void print();
}

//Extra implementation class not required. we can give denition of interface  directly in main class

class DefnitionInterfaceJava8{
	
	public static void main(String[] args){

		LambdaExpressionJava8 ref =() -> System.out.println("welcome to java 8 world");
		ref.print();
	}
}
