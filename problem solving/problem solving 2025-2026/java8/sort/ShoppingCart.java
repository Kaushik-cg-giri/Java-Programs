package java8.sort;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	
public static List<Shop> getShopItems(){ 
	
	List<Shop> gadget = new ArrayList<Shop>();
	
	gadget.add(new Shop("Mobile", "Samsung", 45000));
	gadget.add( new Shop("Mobile", "Apple", 85000));
	gadget.add( new Shop("Laptop", "Dell", 60000));
	gadget.add(  new Shop("Laptop", "HP", 55000));
	gadget.add( new Shop("Television", "Sony", 70000));
	gadget.add( new Shop("Television", "LG", 50000));
	gadget.add( new Shop("Washing Machine", "Whirlpool", 30000));
	gadget.add( new Shop("Refrigerator", "Godrej", 25000));
	gadget.add(  new Shop("Tablet", "Lenovo", 20000));
	gadget.add( new Shop("Smartwatch", "Noise", 5000));
	
	return gadget;

}
 

}
