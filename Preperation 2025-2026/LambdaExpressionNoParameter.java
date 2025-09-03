//Normal format of implementing interface and invoking method(java1.7)

interface LambdaExpressionNoParameterSam{
	public void print();
}

//class declared for implemention for method
class DefntionSam implements LambdaExpressionNoParameterSam{
	
	public void print(){
		System.out.println("Hello welcome to the world");
	}
}

//main class for invoking imented class object
class ImplementationExampleJava7Sam{

	public static void main(String[] args){
		
		DefntionSam def = new DefntionSam();
		def.print();
	}
}
	
