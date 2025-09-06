
public class RunnableInterfaceExecution {

	public static void main(String[] args) {

		Runnable ref1 = new RunnableInterface();
		Runnable ref2 = new RunnableInterface();
		Runnable ref3 = new RunnableInterface();
		
		Thread t1 = new Thread(ref1);
		Thread t2 = new Thread(ref2);
		Thread t3 = new Thread(ref3);
		
		t1.start();
		t2.start();
		t3.start();
	}

}
