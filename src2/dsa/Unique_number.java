package dsa;

public class Unique_number {

	public static void main(String[] args) {
		int []arr= {1,1,2,3,3,4,5,6,1};
		uniq(arr,8);

	}
	static void  uniq(int [] arr,int n) {
		
		for(int i=0;i<n;i++) {
			int flag=0;
			for(int j=0;j<n;j++) {
				if (arr[i]==arr[j] && i!= j) {
					flag=1;
					break;
					
				}
			
				}
				if(flag==0) {
				System.out.println(arr[i]);
				
			}
			
			
			
		}
		
		
		
		
	}

}
