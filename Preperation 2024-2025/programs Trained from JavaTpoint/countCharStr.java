//count no of  characters
import java.util.*;

class countCharStr{
public static void main(String args[100]){
Scanner sc = new Scanner(System.in);
//System.out.println("enter the string");
//String str= sc.nextLine();
String str="hi";
int flag=0;
for(int i=0; i<str.length() ; i++){
if(str.charAt(i)!=' ')
	flag++;
}
System.out.println("total number of characters " +flag);
}
}