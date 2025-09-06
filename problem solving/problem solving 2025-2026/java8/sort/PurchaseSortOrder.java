package java8.sort;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class PurchaseSortOrder {

	public static void main(String[] args) {

		Map<Shop,String> purchase = PurchaseWithId.getGadgetId();
		
		List<Entry<Shop,String> > purchaseList =new ArrayList<>(purchase.entrySet());
		
		//1.Sort According to anonyms function
		
		/*	Collections.sort(purchaseList,new Comparator<Entry<Shop,String>>() {

				@Override
				public int compare(Entry<Shop, String> o1, Entry<Shop, String> o2) {
					// TODO Auto-generated method stub
					return (int) (o1.getKey().getPrice()-o2.getKey().getPrice());
				}
			});
			
			System.out.println("Sort according to price"+ purchaseList);*/
			
			
			//2.sort java 8 lambda
				
			/*Collections.sort(purchaseList,(o1,o2) -> o1.getValue().compareTo(o2.getValue()));
			
			purchaseList.forEach(System.out::println);*/
			
		 //3.using stream api,sorted,comparator,comparing,method refrence
		
				// sort according to key and required field in asc order
			
			/*purchase.entrySet().stream()
							   .sorted(Map.Entry.comparingByKey(Comparator.comparing(Shop::getname)))
							   .forEach(System.out::println);*/
			
			// sort according to value in reverse order
			
			purchase.entrySet().stream()
							   .sorted(Map.Entry.comparingByKey(Comparator.comparing(Shop::getPrice).reversed()))
							   .forEach(System.out::println);
							   
							
	}
	

}
