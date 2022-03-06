package dsa;

public class Practicedsa {

	public static void main(String[] args) {
		int n=0;
		int [] arr= {1,2,3,4,5,6,7,8,9,10};
	
		for(int j=2 ;j<arr.length-1;j++) {

		
		for(int i=j-1 ;i<arr.length-1;i++) {
			n++;
			arr[i] = arr[i+1];
		} 
		}
	
		
		
		
		
		for(int i=0;i<arr.length-1;i++) {
			System.out.println(arr[i]);
		}

	}

}
