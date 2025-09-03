package multithreading;


//Example for sleeping Thr

class MyThread extends Thread{
	
	@Override
	public void run() {
		
		for(int i=0;i<10;i++) {
			
			try {
				System.out.println("Welcome to Thread world....!");
				
				// method will sleep the thread for 1 second
				Thread.sleep(1000);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class MyThread2 extends Thread {
	
	@Override
	public void run() {
		for(int i=0;i<20;i++) {
		
			try {
				System.out.println("Thread used for sleep");
				
				// method will sleep the thread for .5 second
				Thread.sleep(500);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}

public class ThreadWithDifferntFunction {

	public static void main(String[] args) throws InterruptedException {
		
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		MyThread2 t3 = new MyThread2();
		MyThread2 t4 = new MyThread2();
		
			
			t1.start();
			t4.start();
			
			//join() method which allows one thread to wait until another thread completes its execution.
			t1.join();
			t4.join();
			
			System.out.println(t1.isAlive());
			
			System.out.println("Thread Execution Finished");
			//after the t1 and t4 has dead then only t3 start
			t3.start();
			
		
	
	}
}
