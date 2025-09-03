class removeWhiteSpace{
	public static void main(String[] args){
	String str = "Remove white spaces"; 
	String newstr = str.replaceAll("\\s+","");
	System.out.println("New string without white space :" + newstr);
	}
}
