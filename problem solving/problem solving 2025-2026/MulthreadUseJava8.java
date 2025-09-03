
public class MulthreadUseJava8 {
	
	public static void main(String[] args) {
		
		
		Runnable ref = ()->{
			for(int i =0; i<10 ;i++) {
				System.out.println("program "+ i);
			}
		};
		
		Thread tr1  = new Thread(ref);
		Thread tr2 = new Thread(ref);
		tr1.start();
		tr2.start();
		
	}

}
