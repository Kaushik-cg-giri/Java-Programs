import java.util.*;

class countVowl{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int vowl=0;
int cont=0;
String str =sc.nextLine();
for(int i=0;i<str.length();i++){
if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'||str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U')
	vowl++;
else
	cont++;
}
System.out.println("no of vowl " +vowl);
System.out.println("no of consonants "+cont);
}
}