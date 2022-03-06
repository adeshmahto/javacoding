package dataalgo1;

public class Insertionsort {

	public static void main(String[] args) {
	
		int []arr = {5,4,3,2,1};
		
		inst(arr);
	
		
		
	}
	public static void inst(int [] arr) {
		
		int key=0;
		int j=0;
		for(int i=1; i<arr.length;i++) {
			key= arr[i];
			j=i-1;
			while(j>=0 && arr[j]>key) {
				 arr[j+1] = arr[j];
				 j=j-1;
				
			}
			arr[j+1] = key;
		}
		
		for(int i=0;i<arr.length;i++) {
			
			System.out.print(arr[i] +" ");
		}
		
	}

	
	

}
