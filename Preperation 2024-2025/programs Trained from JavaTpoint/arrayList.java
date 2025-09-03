//program to test array list
import java.util.*;
class arrayList{
	
	public static void main(String[] args){
		List<String> list=new ArrayList<String>();
		list.add("jsp");
		list.add("softnotions");
		list.add("Lti");
		System.out.println(list);
		System.out.println(list.get(0));
		Iterator itr = list.iterator();
		
		while(itr.hasNext()){
			Object obj=(String)itr.next();
			//obj.add("Thslc");
			if(obj.equals("Lti"))
				System.out.println("true");
			//System.out.println(obj);
			//System.out.println(str);
		
		}
		Collections.sort(list);
		System.out.println("iteration using for loop");
		for(String inst:list){
			//inst.get(1);
			if(inst.equals("Lti"))
				System.out.println("true");
			System.out.println(inst);
			
		}
	}
}	