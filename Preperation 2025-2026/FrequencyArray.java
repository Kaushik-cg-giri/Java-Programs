
import java.util.Scanner;
class FrequencyArray{
	public static void main(String[] args){
		//decleraing array
		int[] arr = new int[5];
		 Scanner sc = new Scanner(System.in);
		
		int count =1;
		//storing  frequency cont initalize an array
		int[] freq= new int[arr.length];
		int k =0;
		System.out.println("enter 5 elemnts into array");

		//inserting elemnts into array
		for(int i=0;i<arr.length;i++){
			arr[i] = sc.nextInt();
		}
		sc.close();
		// check frequency of elemnt
		for(int i=0;i<arr.length;i++){// take each elemnt
			for(int j=i+1;j<arr.length;j++){// comapre with other elemnt
				if(arr[i] == arr[j]){// if comparison true
					 count++; // increment count
					arr[j] = -1; // if compared elemnt not come agin assign as -1
				}
			}
			freq[k] = count; // count store to array
			k++;// increment position of frq array
			count=1;// set count agin -1
		}

		for(int i =0 ; i<arr.length;i++){
			if(arr[i]!=-1){
				System.out.println(arr[i] +"frequency :"+freq[i]);
			}
		}
	}
}

		
