
import java.util.*;

class QuestAddList{

	public static void main(String[] args){
		ArrayList list = new ArrayList();
		list.add(50);
		list.add(20);
		for(int i=0;i<list.size();i++){
			list.add(30);
		}

		System.out.println(list);
	}

}		
