//Normal format of implementing interface and invoking method(java1.7)

interface LambdaExpressionNoParameter{
	public void print();
}

//class declared for implemention for method
class Defntion implements LambdaExpressionNoParameter{
	
	public void print(){
		System.out.println("Hello welcome to the world");
	}
}

//main class for invoking imented class object
class ImplementationExampleJava7 {

	public static void main(String[] args){
		
		Defntion def = new Defntion();
		def.print();
	}
}
	
