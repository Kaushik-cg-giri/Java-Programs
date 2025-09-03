
public class ThreadExecutionClass {

	public static void main(String[] args) {

	
		ThreadClass t1 = new ThreadClass();
		ThreadClass t2 =new ThreadClass();
		ThreadClass t3 = new ThreadClass();
		
		t1.start();
		t2.start();
		t3.start();
	}

}
