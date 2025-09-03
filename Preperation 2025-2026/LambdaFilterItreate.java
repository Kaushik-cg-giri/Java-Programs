//Lambda Expression to Filter Mobile price grater than 20000 and iterate
import java.util.*;
import java.util.stream.Collectors;
import java.util.Collections;
class Mobile{
	 int id;
	 String brand;
	 long price;
	
	public Mobile(int id, String brand, long price){
		this.id =id;
		this.brand = brand;
		this.price = price;
	}

	public int getId(){
		return id;
	}
	public String getBrand(){
		return brand;
	}
	public long getPrice(){
		return price;
	}
}

class LambdaFilterItreate{
	public static void main(String[] args){
				List<Mobile>mobileList = new ArrayList<Mobile>(Arrays.asList( 				  												 new Mobile(1,"Samsung",30000),
											 new Mobile(2,"Motorola",15000),
											 new Mobile(3,"Iqoo",25000),
											 new Mobile(4,"Vivo",13000)));

				mobileList.add(new Mobile(5,"Mi",18000));
				mobileList.add(new Mobile(6,"Apple",88000));
				mobileList.add(new Mobile(7,"One plus",35000));
				mobileList.add(new Mobile(8,"Oppo",15000));
				//filter price greater than 20000

				List<Mobile> filteredMb = mobileList.stream()
										     .filter(i->i.price>20000)
										      .collect(Collectors.toList());
				//price greater than 20000 sort in ascending order
			/*	Collections.sort(filteredMb,(p1,p2)->{
					return p1.brand.compareTo(p2.brand);
				});*/
				filteredMb.sort(Comparator.comparing(p->p.brand));
				System.out.println("Mobile price greater than 20000 in ascending order");
				// iterate each mobile
				filteredMb.forEach(i->System.out.println( i.id+" "+i.brand+" "+i.price ));
		}
}
		


