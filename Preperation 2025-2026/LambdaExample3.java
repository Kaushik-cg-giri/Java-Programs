import java.util.*;
class LambdaExample3{
	public static void main(String[] args){
		List<Integer> list = Arrays.asList(10,5,6,8,7);
		System.out.println("Elemnt in the list are :");
		list.forEach(System.out::println);
		//find odd number from list
		System.out.println("Odd numbers in list are :");
		list.stream()
		     .filter( i-> i%2!=0)
		     .forEach(i->System.out.print(i+" "));
	}
}
