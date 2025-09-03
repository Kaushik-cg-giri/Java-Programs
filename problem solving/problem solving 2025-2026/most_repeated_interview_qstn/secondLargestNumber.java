package most_repeated_interview_qstn;

public class secondLargestNumber {

	public static void main(String[] args) {
		
        int[] arr = {12, 35, 1, 10, 34, 1};

        int secndLgst = secondLargest(arr);
        
        System.out.println("Second Largest :"+ secndLgst);

	}

	private static int secondLargest(int[] arr) {
		
		int temp =0;
		int scndTemp=0;
		
		for(Integer i: arr) {
			if(i>temp)
				temp=i;
		}
		
		for(Integer i:arr) {
			if(i>scndTemp&& i!=temp)
				scndTemp=i;
		}
		return scndTemp;
	}

}

