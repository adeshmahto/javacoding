package hashingmap;

import java.util.HashMap;

public class Findgivensubarray {

	public static void main(String[] args) {
		
		int arr[]= {10,15,-5,15,-10,5};
		int sum=5;
		subarrsum(arr, sum);
		
	}
	public static void subarrsum(int arr[],int sum) {
		
		int cursum=0;
		int start=0;
		int end=-1;
		int n=arr.length;
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<n;i++) {
			cursum+=arr[i];
			
			if(cursum-sum==0) {
				start=0;end=i;
				break;
			}
			if(map.containsKey(cursum-sum)) {
				start=map.get(cursum-sum)+1;
				end=i;
				break;
			}
			map.put(cursum, i);
		}
		if(end==-1) {
			System.out.println("Not found");
		}else {
			System.out.println(start+" "+ end);
		}
		
	}

}
