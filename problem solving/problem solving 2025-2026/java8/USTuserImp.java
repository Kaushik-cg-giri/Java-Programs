package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class USTuserImp {

	public static void main(String[] args) {

		USTuser user1 = new USTuser("Rohit", "Batting", "07/05/89");
		USTuser user2 = new USTuser("kohli", "batting","09/7/89");
		USTuser user3 = new USTuser("Jadega", "allrounde", "07/05/89");
		
		List<USTuser> users = Arrays.asList(user1,user2,user3);
		
		String givenDate ="07/05/89";
		
		//printing in console
		users.stream().filter(user->user.getDob().equals(givenDate))
					  .forEach(user->System.out.println(user.getName()));
		
		//store it in list
		List<String> names = users.stream().filter(user->user.getDob().equals(givenDate))
				                           .map(user->user.getName())
				                           .collect(Collectors.toList());
		System.out.println(names);
										
	}

}
