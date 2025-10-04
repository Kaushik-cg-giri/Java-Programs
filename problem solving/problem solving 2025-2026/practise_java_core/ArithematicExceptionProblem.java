package practise_java_core;

public class ArithematicExceptionProblem {

	    public static void main(String[] args) {
	        int a = 10;
	        int b = 0;
	        arithematicException(a,b);
	    }
	
	public static void arithematicException(int a, int b) {
		int divident =0;
		
		try {
			divident =a/b;
		} catch (ArithmeticException e) {
			
			System.out.println("Cannot divide by zero ");
		}
	}

}
