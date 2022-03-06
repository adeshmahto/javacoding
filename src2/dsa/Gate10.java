package dsa;

public class Gate10 {

	public static void main(String[] args) {
	
	int [] arr= {1,2,3,4,4,5};
	Bs(arr,3,6);
	
		
	}
	static void Bs(int [] arr, int key,int n) {
		int mid;
		int  low=0;
		int heigh= n-1;
		while(low<=heigh) {
			mid=(low+heigh)/2;
			if(key< arr[mid]) {
				 heigh = mid -1;
			}
			else if(key>arr[mid]) {
				low = mid +1;
				
			}
			else if(key==arr[mid]) {
				
				System.out.println(mid);
				break;
			}
			
		}
		
	
		
		
		
		
	
			
		
	}

}
