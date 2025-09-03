package multithreading;

/*Since Runnable interface is functional interface so we dont need to provide seperate class for 
providing definion for run(), we can provide implimentation in same class using lambda expression */

public class ImplementMultithreadingUsingJava8 {

	public static void main(String[] args) {
		
		//define Runnable interface using lambda expression
		
		Runnable def = ()->{
			for(int i=0; i<10; i++) {
				System.out.println("Welcome to multithreading using lambda "+i);
			}
		};
		
		//creat Thread object and interface refrence pass as object (it contain the defniotion run() )
		
		Thread t1 = new Thread(def);
		
		Thread t2 = new Thread(def);
		
		Thread t3 = new Thread(def);
		
		Thread t4 = new Thread(def);
		
		//using Thread object refrence call start()
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
	}

}
