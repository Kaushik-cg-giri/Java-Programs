package multithreading;

//Creating multithreading by implimenting Runnable Interface

//cleate class that impliments from Runnable Interface

//Define the run()
 class MainRunnableInterfaceCalss implements Runnable{

	@Override
	public void run() {

		for(int i=10; i>0 ;i--) {
			
			System.out.println("Welcome to runnable interface "+i);
		}
	}

}

//create thread class object  assigned to Runnable interface refrence
 
 //create object of Thread and pass the refrence as argument (new Thread(r1) , it contain the defnition of run())
 
 //call start() using this thread refrence(t1.start()) to execute run()

public class ImimentingUsingRunnableInterface {
	
	
	public static void main(String[] args) {
		
		Runnable r1 = new MainRunnableInterfaceCalss();
		
		Runnable r2 = new MainRunnableInterfaceCalss();
		
		Runnable r3 = new MainRunnableInterfaceCalss();
		
		Runnable r4 = new MainRunnableInterfaceCalss();
		
		
		Thread t1 = new Thread(r1);
		
		Thread t2 = new Thread(r2);
		
		Thread t3 = new Thread(r3);
		
		Thread t4 = new Thread(r4);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
	}
}