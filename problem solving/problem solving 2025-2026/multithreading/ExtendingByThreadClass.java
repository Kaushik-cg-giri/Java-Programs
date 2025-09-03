package multithreading;


//Creating multithreading by extending Thread class

//cleate class that extend from Thread

//Define the run()

class MainThreadClass extends Thread {
	
	public void run() {
		
		for(int i=0;i<10;i++) {
		
			System.out.println("Welcome to Thread class "+i);
			
		}
	}
	
}

//create thread class object

// call the start() to execute the run() from TreadClass

public class ExtendingByThreadClass{
	
	public static void main(String[] args) {
		
		MainThreadClass t1 = new MainThreadClass();
		
		MainThreadClass t2 = new MainThreadClass();
		
		MainThreadClass t3 = new MainThreadClass();
		
		MainThreadClass t4 = new MainThreadClass();
			
			t1.start();
			
			t2.start();
			
			t3.start();
			
			t4.start();
		
		
	}
}



