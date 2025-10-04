package practise_java_core;

//muultiThreading by using Thread extenssion
public class ThreadClass extends Thread {
	int i=0;
	public void run() {
	
		System.out.println("executing multiple task at same time is known as multithreading "+ i++);
	}

}

