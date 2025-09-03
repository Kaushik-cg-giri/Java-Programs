
 interface example{
 public void method1(){}
 }
 class define implements example{
 public void method1(){
 System.out.println("hello world");
 }
 }
 class main{
 public static void main(String[] args){
 define d =new define();
 d.method1();
 }
 }