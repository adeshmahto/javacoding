package algo;

public class Mergesort {

	
	public static void main(String[] args) {
		
		int arr[]= {1,3,2,4};
		merge(arr,0,1,3);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		}

	  public static void merge(int []arr,int start,int mid,int end) {
		int i=start;
		int j=mid+1;
		int k=0;
		int temp[]=new int [end-start+1];            // temp array which store value of original element into segment
		
		while(i<=mid && j<=end) {           // we sorting first along with store it in temp variable;
			
			if(arr[i]<arr[j]) {
				temp[k++]=arr[i++];  // or i=i+1; in next step;
			}else {
				temp[k++]=arr[j++];
			}
		}
		// in case of odd lengthh of the original array or uneven 
		while(i<=mid) {
			temp[k++]=arr[i++];
		}
		while(j<=end) {
			temp[k++]=arr[j++];
		}
		for(i=start;i<=end;i++) {
			arr[i]=temp[i-start];
		}

		
	}
	  }


	


