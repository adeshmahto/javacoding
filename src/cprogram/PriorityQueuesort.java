package cprogram;

import java.util.PriorityQueue;
import java.util.Stack;

public class PriorityQueuesort {

	public static void main(String[] args) {
		Stack<Integer>st=new Stack<>();
		st.add(1);
		st.add(4);
		st.add(6);
		st.add(2);
		sort(st);
		
		System.out.println(st.peek());
		
	

	}
	public static void sort(Stack<Integer> st) {
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		
		pq.add(1);
		pq.add(5);
		pq.add(0);
//		while(!st.isEmpty()) {
//			pq.add(st.pop());
//		}
//		while(!pq.isEmpty()) {
//			st.add(pq.remove());
//		}
//		while(!st.isEmpty()) {
//			System.out.println(st.pop());
//		}
//		
		//System.out.println(pq.poll());
	
	}

}
