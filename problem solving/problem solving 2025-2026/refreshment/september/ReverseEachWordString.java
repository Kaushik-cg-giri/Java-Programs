package refreshment.september;

public class ReverseEachWordString {

	public static void main(String[] args) {

		String str ="My carrier gone away";
		
		String[] strArray = str.split(" ");
		
		StringBuffer reverseString = new StringBuffer();
		
		for(String word : strArray) {
			
			StringBuffer wordReverse = new StringBuffer(word);
			
			wordReverse.reverse();
			
			reverseString.append(wordReverse);
			
			reverseString.append(" ");
		}
		
		System.out.println("Reverse each word in String : "+reverseString);
	}

}
