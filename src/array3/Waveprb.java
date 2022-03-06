package array3;

public class Waveprb {

	public static void main(String[] args) {
	int []arr= {1,2,3,4};
	
	int temp=0;
	for(int i=0;i<arr.length/2;i++) {
		temp=arr[i];
		arr[i]=arr[i+1];
		arr[i+1]=temp;
	}
	
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
	}
	

	}

}
