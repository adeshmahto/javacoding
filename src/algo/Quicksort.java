package algo;

public class Quicksort {

	public static void main(String[] args) {
		int arr[]= {9,6,5,0,8,2,4,7};
		int r=arr.length-1;
		int p=0;
		
		
		Quicksort(arr,p,r);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
	

	}
	
	public static  void Quicksort(int arr[],int p,int r) {
		if(p<r) {
			int q=partition(arr,p,r);
			Quicksort(arr,p,q-1);
			Quicksort(arr,q+1,r);
		}
		
	}
	
	public static int partition(int []arr,int p, int r) {
		int x=arr[r];
		int i =p-1;
		int temp;
		
		for(int j=p;j<r;j++) {
			if(arr[j]<=x) {
				i=i+1;
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				
			}
		}
		temp=arr[i+1];
		arr[i+1]=arr[r];
		arr[r]=temp;
		return i+1;
		
	}

}
