package algo;

public class Bubblesort {

	public static void main(String[] args) {
		
		int arr[]= {10,30,50,20,40};
		Bs(arr);
		
		

	}
	public static void Bs(int [] arr) {
		int n=arr.length;
		int stopped;
		for(int i=0;i<n-1;i++) {
			stopped=0;
			for(int j=0;j<n-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					
					arr[j]=arr[j]^arr[j+1];
					arr[j+1]=arr[j]^arr[j+1];
					arr[j]=arr[j]^arr[j+1];
					stopped=1;
				}
			}
			if(stopped==0) {
				
				break;
			}
	
		}
	}

}
