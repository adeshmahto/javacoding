package dataalgo1;

public class Bubble_sort {

	public static void main(String[] args) {
int [] arr= {6,4,2,8,9};
 bubble(arr);
	}
	public static void bubble(int [] arr) {
		
	
		
		for(int i=0;i<arr.length-1;i++) {
			
			for(int j=0; j<arr.length-1;j++) {
				
				if(arr[j]> arr[j+1]) {
					
					arr[j]=arr[j]^arr[j+1];
					arr[j+1]=arr[j]^arr[j+1];
					arr[j]=arr[j]^arr[j+1];
					
				}
			}
		}
		
		for(int i=0 ;i< arr.length ;i++) {
			
			System.out.print(arr[i] +" ");
		}
	}

	
	
}
