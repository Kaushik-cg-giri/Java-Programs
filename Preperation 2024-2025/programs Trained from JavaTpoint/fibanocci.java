class fibanocci{
public static void main(String args[]){
int first=0;
int second=1;
System.out.println(first+"/n"+second);
//System.out.println(second);
int sum=0;
for(int i=2;i<20;i++){
sum=first+second;
System.out.println(sum);
first=second;
second=sum;
}
}
}
