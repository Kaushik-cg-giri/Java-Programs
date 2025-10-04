package practise_java_core;


//this class used for provide implimntion for run() in Runnable interface
public class RunnableInterface implements Runnable{

	@Override
	public void run() {

		for(int i=0;i<3;i++) {
			System.out.println("executing muliple task at same time is known as multithreading "+ i);
		}
			
	}

}
