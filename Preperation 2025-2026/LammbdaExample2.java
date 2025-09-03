import java.util.*;
import java.util.stream.Collectors;

class LammbdaExample2{
	public static void main(String[] args){
		List<Integer> list = Arrays.asList(2,3,5,4,7);
		System.out.println("list elemnt are");
		list.forEach(i->System.out.print(i+" "));
		System.out.println();
		//use map() functiion to print square of each elemnt
		List<Integer> mapedList = list.stream()
		     						.map(i->i*i)
		      						.collect(Collectors.toList());
		System.out.println("Squared elemnts are :"+mapedList);
	}
}

