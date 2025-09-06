package multithreading;


class MainThread extends Thread{
	
	private  int count;
	
	public synchronized void increment() {
		count++;
	}
	
	public synchronized int get() {
		return count;
	}
}



public class SynchronizationThread {

	public static void main(String[] args) throws InterruptedException  {

		MainThread m1 = new MainThread();
		
		Thread t1 =new Thread( () ->  {
			for(int i=1; i<=5000; i++) {
			
				m1.increment();
			}
		});
		
		Runnable def2 = () ->{ 
			for(int i=1;i<=5000;i++) {
				m1.increment();
			}
		};
		
		Thread t2 = new Thread(def2);
		
		t1.start();
		
		t2.start();
		t1.join();
		t2.join();
		
		System.out.println(m1.get());
				

	}

}
