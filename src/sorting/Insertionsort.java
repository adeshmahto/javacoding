package sorting;

public class Insertionsort {

	public static void main(String[] args) {
	  
		int [] arr= {5,4,3,2,1};
		int key=0,i,j;
		for( i=1;i<arr.length;i++) {
			key=arr[i];
		for(j=i-1;j>=0;j=j-1) {
		//System.out.print(j);
			arr[j+1]=arr[j];
		                                                                                                                                          
		}
		arr[j+1]=key;
		}
		for(i=0;i<arr.length;i++) {
			//System.out.println(arr[i]);
		}

	}

}
