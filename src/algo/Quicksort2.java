package algo;

public class Quicksort2 {

	public static void main(String[] args) {

     int arr[]= {1,2,4,6,3,5,7,9};
     quicksort(arr,0,arr.length-1);
    for(int i=0;i<arr.length;i++) {
    	System.out.print(arr[i]+" ");
    }
     
  
	}
	
	public static void quicksort(int arr[],int l,int h) {
		if(l<h) {
			int pivot =partition(arr,l,h);
			quicksort(arr,l,pivot-1);
			quicksort(arr,pivot+1,h);
			
		}
	}
	
	public static int partition(int arr[],int l,int h) {
		int pivot=arr[l];
		int i=l;
		int j=h;
		int temp;
		while(i<j) {
			while(arr[i]<=pivot)i++;
			while(arr[j]>pivot)j--;
			if(i<j) {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
			temp=arr[j];
			arr[j]=arr[l];
			arr[l]=temp;
			return j;

	}

}
