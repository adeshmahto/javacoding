package queue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class Pirority {

	public static void main(String[] args) {
		
		
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		int arr[]= {1,4,6,8,9,1,0};
		
		int n=7;
		int k=3;
		for(int i=0;i<n;i++) {
			if(i<k) {
				pq.add(arr[i]);
			}
			else {
				if(pq.peek()<arr[i]) {
					
					pq.poll();           // remove the smaller element;
					pq.add(arr[i]);
				}
			}
		}
		
		// pq is give ans from accending order but we need decending order so we use Arraylist and sort it in reverse order.
		 ArrayList<Integer> ans=new ArrayList<>(pq);
		 Collections.sort(ans,Collections.reverseOrder());
		 for(int x:ans) {
			 System.out.print(x+" ");
		 }
		 System.out.println();
		 
		
	
		
	

	}

}
