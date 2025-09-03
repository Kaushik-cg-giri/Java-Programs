//printing given number is prime or not

class prime{

public static void main(String args[]){

int n=20,temp=0;

for(int i=1;i<=n;i++){
	if(n%i==0)
		temp+=1;
	
}

if(temp==2)
	System.out.print("number is  prime");
else
	System.out.print("number is not prime");

}
}