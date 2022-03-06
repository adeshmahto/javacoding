package dsa;

public class Dulpicateelement {

	public static void main(String[] args) {
		int [] arr= {1,2,2,3,4,5};
		int f=0;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=(i+1);j<arr.length;j++) {
				f++;
				if(arr[i]==arr[j]) {
					
					System.out.println( arr[i]);
				//break;
				
			}
				
				
		}
			
		
	}
	
		

}}
