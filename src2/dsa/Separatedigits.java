package dsa;

public class Separatedigits {

	public static void main(String[] args) {
	int []arr= {1,-1,3,5,-7,-8};
	int i,j=0;
	int temp=0;
	for(i=0;i<arr.length;i++) {
		if(arr[i]>0) {
		temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		j++;
		}
	}
	for(i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
	}

	}

}
