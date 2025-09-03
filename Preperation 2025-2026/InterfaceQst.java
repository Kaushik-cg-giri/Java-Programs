class InterfaceQst{

	public void print(){
			System.out.println("Hello first class...");
		}

}

class genertClass extends InterfaceQst{
		
		
		public void print(){
				System.out.println("Hello world...");
		}
}

class description{

	public static void main(String[] args){

			InterfaceQst qst = new genertClass();
			qst.print();
	}
}
