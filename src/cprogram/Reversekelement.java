package cprogram;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Reversekelement {

	public static void main(String[] args) {
		
		Queue<Integer> q=new LinkedList<>();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		
		Rev(q,3);

	}
	public static void Rev(Queue<Integer>q,int k) {
		int size=q.size();
		Stack<Integer> st=new Stack<>();
		
		for(int i=0;i<k;i++) {
			st.add(q.remove());
		}
		for(int i=0;i<k;i++) {
			q.add(st.pop());
		}
		for(int i=0;i<size-k;i++) {
			q.add(q.remove());
		}
		
		while(!q.isEmpty()) {
			System.out.println(q.remove());
			
		}
		
	}
	

}
