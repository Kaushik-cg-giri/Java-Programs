//printing fibanocci series

class fibanocci{

public static void main(String args[]){
	
	int first=0,second=1,result=0;

int n=5;
	
System.out.println(first+"\n"+second);

for(int i=2;i<n;i++){

result =first+second;
first=second;
second=result;
System.out.println(result);

		}
	}
}	