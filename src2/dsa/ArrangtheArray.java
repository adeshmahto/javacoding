package dsa;

public class ArrangtheArray {

	public static void main(String[] args) {
		int [] arr= {1,2,3,4,5,6};
		int n=6;
		int max_index=n-1;
		int min_index=0;
		int Max=arr[n-1]+1;
		for(int i=0;i<n;i++) {
			if((i&1)==0) {
				arr[i]=(arr[max_index]%Max)*Max+arr[i];
				max_index--;
			}
			else {
				arr[i]=(arr[min_index]%Max)*Max+arr[i];
				min_index++;
			}
		}
		for(int i=0;i<n;i++) {
			arr[i]/=Max;
		}
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]);
		}

	}

}
