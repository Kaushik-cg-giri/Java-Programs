package java8.sort;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PurchaseWithId {

	public static Map getGadgetId() {

		Map<Shop,String> gadget = new HashMap<Shop,String>();
		
		gadget.put(new Shop("Mobile", "Samsung", 45000),"888");
		gadget.put( new Shop("Mobile", "Apple", 85000),"444");
		gadget.put( new Shop("Laptop", "Dell", 60000),"12");
		gadget.put(  new Shop("Laptop", "HP", 55000),"777");
		gadget.put( new Shop("Television", "Sony", 70000),"222");
		gadget.put( new Shop("Television", "LG", 50000),"444");
		gadget.put( new Shop("Washing Machine", "Whirlpool", 30000),"777");
		gadget.put( new Shop("Refrigerator", "Godrej", 25000),"111");
		gadget.put(  new Shop("Tablet", "Lenovo", 20000),"555");
		gadget.put( new Shop("Smartwatch", "Noise", 5000),"55");
		
		return gadget;
	}

}
