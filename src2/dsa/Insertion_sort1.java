package dsa;

public class Insertion_sort1 {

	public static void main(String[] args) {

	int  [] arr= {5,4,3,2,1};													//		{5,4,3,2,1} -> {4,5,3,2,1} -> {4,3,5,2,1} -> {3,4,5,2,1}-> {1,2,3,4,5}
		inst(arr);
		
	}
	static void inst(int []arr) {
		int key;
		int j;
		for(int i=1;i<arr.length;i++) {
			key =arr[i];
			j=i-1;
			while(j>=0 && arr[j]>key) {
				arr[j+1]=arr[j];      // 5->4;
				j=j-1;
				
				
			}
			arr[j+1]=key;   // 5 now that place 4 in this index;
			
			
		}
		for(int i = 0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}
		
		
	}
	
	


}
