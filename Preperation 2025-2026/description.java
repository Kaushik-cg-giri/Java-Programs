class InterfaceQst1{
	
	public InterfaceQst1(){
		System.out.println("inside super constructor");
	}

	public void print(){
			System.out.println("Hello first class...");
		}

}

class genertClass1 extends InterfaceQst1{

		public genertClass1(){
			System.out.println("inside child constructor");
		}

		public void print(){
				
				System.out.println("Hello second class...");
		}
}

class description1{

	public static void main(String[] args){

			InterfaceQst1 qst = new genertClass1();
			qst.print();

	}
}
