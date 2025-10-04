package practise_java_core;

/*
 
 Fibonacci with Recursion (No Loops)
Compute fib(n) using recursion only (no loops, no extra data structures).
 */
public class FibanocciRecursion {

	public static void main(String[] args) {
		
		int num=6;
		
		for(int i =0;i<num;i++) {
			System.out.println("Fibanocci series "+fibanociRecurssion(num));
		}
		
	}

	private static int fibanociRecurssion(int num) {
		
		if(num==0)
			return 0;
		else if(num==1)
			return 1;
		else
			return fibanociRecurssion(num-1)+fibanociRecurssion(num-2);
	}

}
