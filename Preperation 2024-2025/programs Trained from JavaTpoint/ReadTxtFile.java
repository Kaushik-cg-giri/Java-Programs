
//Read data from text file

class ReadTxtFile{
	
	public static void main(String[] args){
		try{
		FileReader readr = new FileReader(home/kaushik/Downloads/java interview preperation time table.text);
		BufferedReader rdr = new BufferedReader(rdr);
		
		String str = rdr.read();
		
		while(str!=null){
			System.out.println(str);
		}
		}
		catch(Exception e){e.Exception();}
		readr.close();
		rdr.close();
	}	
}	