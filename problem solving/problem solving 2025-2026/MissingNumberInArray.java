
public class MissingNumberInArray {
	
	public static void main(String[] args) {
		int [] arr = {0,1,2,3,4,6,7,8};
		int n= arr.length;
		
		int Nnatural = 0;
		Nnatural = n*(n+1)/2;
		int sum = 0;
		int unKnownNmbr=0;
		for(Integer i : arr ) {
			sum = sum+i;
		}
		 unKnownNmbr = Nnatural - sum;
		 System.out.println("number not present in aray "+unKnownNmbr);
	}

}
