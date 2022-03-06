package algo;

public class Insertion_sort {
	public static void main(String[] args) {
		
		int arr[]= {2,1,3,5,4};
		insert_sort(arr);
		for(int e:arr) {
			System.out.println(e);
		}
	}
	public static void insert_sort(int arr[]) {
		int i;
		int key;
		for(int j=1;j<arr.length;j++) {
			key=arr[j];
			i=j-1;
			while(i>=0 && arr[i]>key) {
				arr[i+1]=arr[i];
				i--;
			}
			arr[i+1]=key;
		}
		
	}
	

}
