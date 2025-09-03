import java.util.List;
import java.util.Arrays;

class LambdaExample1{
	public static void main(String[] args){
		List<Integer> list = Arrays.asList(41,20,7,56,23);
		//forEach iteration
		list.forEach(i->System.out.print(i+" "));
	}
}
