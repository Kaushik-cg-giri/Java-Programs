
public class RunnableUseJav8 {

	public static void main(String[] args) {

		Runnable ref= ()->{ 
			for(int i=0; i<3;i++)
		{
			System.out.println("executing muliple task at same time is known as multithreading  using java8   "+ i);
			
		}
	  };
	
	Thread t1 = new Thread(ref);
	Thread t2 = new Thread(ref);
	Thread t3 = new Thread(ref);
	
	t1.start();
	t2.start();
	t3.start();
	}
}
