package java8.sort;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

// here we are practise different method of sorting
public class ShoppingForSort {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		List<Shop> item = ShoppingCart.getShopItems();
		

		System.out.println("Tradional approach n=1");
		
		System.out.println("Annonyms fn approach n=2");
		
		System.out.println("Using Lambda Expression n=3");
		
		System.out.println("Using Direct logic & lambda n=4");
		
		System.out.println("Using Comparing function & Provide field name n=5");
		
		System.out.println("Using Comparing function and method refrenc n=6");
		
		System.out.println("Choose sorting approach  that need to refer, required approach number value provide");
		
		String n = sc.next();
		
		switch (n) {
		
		case "1":	//1.Shoping in older method by implimenting comparator method
		
					System.out.println("Sort Shop based on price in java 1.7");
		
					implimentComparatorInterface(item);
			
					break;
		
		case "2":	//2. impliment compare method inside ShoppingCart
			
					 System.out.println("Sort Shop based on name by impliment compartor defntion as anonymus function in java 1.7");
			
					 implimentComparatorInsideShopingCart(item);
					  
					 break;
					  
		case "3":	// Above 1 & 2 oder method used before java 1.8
			
					//Now we can go through java 1.8
			
					//3. using lambda expression provide implemention for new Comparator()
			
					System.out.println("Sort Shop based category implementing Lambda Expression ");
			
					implemntUsingLambdaExpression(item);
					
					break;
					
		case "4":	//using Stream api
			
					//4.In Stream api directly using compare logic
			
					System.out.println("Sort Shop based price implemnt stram api & Lambda Expression");
			
					implimentUsingStreamLambda(item);
					
					break;
					
		case "5":	//5. In Stream API use comparing function and lambda 
			
					System.out.println("Sort Shop based name implemnt stram api,comparing function");
			
					implimentUsingStreamComparingWithLambda(item);
					
					break;
					
		case "6": //6. using method refrence
			
				  System.out.println("Sort Shop based category implemnt stram api & Method Refrence");
			
				  implimentUsingComparingWithMethodRefrence(item);
				  
				  break;

		default: System.out.println("Default Sort 5 & 6 approach practise");
				 
		          break;
		}
 
				
		//Try to use 5 & 6 approach			
				
		
	}

	//6. using method refrence
	private static void implimentUsingComparingWithMethodRefrence(List<Shop> item) {

		item.stream()
			.sorted(Comparator.comparing(Shop::getCategory))
			.forEach(System.out::println);
	}

	//5. In Stream API use comparing function and lambda 
	private static void implimentUsingStreamComparingWithLambda(List<Shop> item) {
		
		item.stream().sorted(Comparator.comparing(sh -> sh.getname()))
					.forEach(System.out::println);
	}

	//4.In Stream api directly using compare logic
	private static void implimentUsingStreamLambda(List<Shop> item) {

		item.stream().sorted((o1,o2) -> (int)(o1.getPrice()-o2.getPrice()))
		.forEach(i -> System.out.println(i));
	}

	//3. using lambda expression provide implemention for new Comparator()
	private static void implemntUsingLambdaExpression(List<Shop> item) {

		Collections.sort(item, (o1,o2) -> o1.getCategory().compareTo(o2.getCategory()));
		
		item.forEach(System.out::println);		
	}

	//2. impliment compare method inside ShoppingCart
	private static void implimentComparatorInsideShopingCart(List<Shop> item) {

		Collections.sort(item, new Comparator<Shop>() {

		@Override
		public int compare(Shop o1, Shop o2) {
			// TODO Auto-generated method stub
			return o1.getname().compareTo(o2.getname());
		}
		
	});
	
		item.forEach(i -> System.out.println(i));
	}

	//1.Shoping in older method by implimenting comparator method
	private static void implimentComparatorInterface(List<Shop> item ) {

		Collections.sort(item,new MyComparator());
		
		System.out.println(item);
	}

	


}

//older method used by implement comparator interface

class MyComparator implements Comparator<Shop>{

	@Override
	public int compare(Shop o1, Shop o2) {
		// TODO Auto-generated method stub
		return (int) (o1.getPrice()-o2.getPrice());
	}
	 
 }
