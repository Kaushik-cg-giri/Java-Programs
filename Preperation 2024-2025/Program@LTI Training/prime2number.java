// prim number btween twwo number

class prime2nmbr{
	
	public static void main(String args[]){
		int startnmbr=10,endnmbr=20,temp=0;
		for(int i=10;i<=20;i++){
			for(int j=1;j<=i;j++){
				
				if(i%j==0)
					temp+=1;
				
			}
			
		if(temp==2)
				System.out.print(i);
		}	
	}
}	