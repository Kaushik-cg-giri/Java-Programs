import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CarSort {

	public static void main(String[] args) {
		Car cr0 = new Car("Maruti", "Swift", 600);
		Car cr1 = new Car("Maruti", "Swift", 500);
		Car cr2 = new Car("Toyota", "Forture", 1200);
		Car cr3 = new Car("Toyota", "Glanza", 800);
		Car cr4 = new Car("Tata", "Nexon", 1000);
		Car cr5 = new Car("Maruti","Omni",250);
		Car cr6 = new Car("Tata","Altroz",600);
		
		List<Car> carList = new ArrayList<Car>();
		carList.add(cr0);
		carList.add(cr1);
		carList.add(cr2);
		carList.add(cr3);
		carList.add(cr4);
		carList.add(cr5);
		carList.add(cr6);
		
		//print car object ony not print properties
		//System.out.println("List of car in showroom "+ carList);
	
		carList.forEach(i->System.out.println("Brand :"+i.getBrand()+" "+"Model:"+i.getModel()+" "+"Price:"+i.getPrice()));
		//carList.sort(Comparator.comparing((Car c) -> c.getPrice()));

		
		System.out.println("Ater sorting Model...............");
		

		
		//carList.sort(Comparator.comparing(Car :: getModel));
		//carList.forEach(i->System.out.println("Brand :"+i.getBrand()+" "+"Model:"+i.getModel()+" "+"Price:"+i.getPrice()));

		//second sort option override the first sort option...so second sorting only work
		
		//we need sort after model and price
		System.out.println("After sorting Model then compare Price..............");
		carList.sort(Comparator.comparing(Car::getModel).thenComparing(Car :: getPrice));
		carList.forEach(i->System.out.println("Brand :"+i.getBrand()+" "+"Model:"+i.getModel()+" "+"Price:"+i.getPrice()));

		
	}

}
