package java8;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;


//Find largest element using stream
public class LargUsingStream {
	
    public static void main(String[] args) {

    int[] arr ={5,4,99,1};
    
    List<Integer> list = new ArrayList<>();
    
    for(Integer i : arr){
        list.add(i);
    }
    System.out.println(list);
   Optional<Integer> larg = list.stream().
		   					sorted(Comparator.reverseOrder())
		   					.findFirst();
         System.out.println(larg);
        
    }

}
