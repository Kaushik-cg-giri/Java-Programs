package most_repeated_interview_qstn;

public class ReverseEachWordInString {

	public static void main(String[] args) {

		String str= "Hello World";
		/*int length = str.length();
		String[] arr = str.split(" ");
		
		StringBuffer str2 = reverseEachWord(arr,length);*/
		
		String str2 =	reverseEachWord(str);
		
		System.out.println("Reverse each word in sentence :"+ str2);
	}

/*	private static StringBuffer reverseEachWord(String[] arr,int len) {
		
		char[] strChar = new char[len];
		int k =0;
		StringBuffer rverseWord = new StringBuffer();
		String[] strer = new String[len];		
		for(int i=0; i<arr.length;i++) {
			
			char[] singleWrd = arr[i].toCharArray();
			
			for(int j=singleWrd.length-1; j>=0; j--) {
				strChar[k] = singleWrd[j];
				k++;
			}
			strChar[k]=' ';
			
		}
		rverseWord.append(strChar);
		rverseWord.append(" ");
		return rverseWord;
	}*/
	
    private static String reverseEachWord(String input) {
        String[] words = input.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            StringBuilder sb = new StringBuilder(word);
            sb.reverse();
            result.append(sb);
            result.append(" ");
        }

        // Remove trailing space
        return result.toString().trim();
    }
	

}
