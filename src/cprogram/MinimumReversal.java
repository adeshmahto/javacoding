package cprogram;

import java.util.Stack;

public class MinimumReversal {

	public static void main(String[] args) {
		
		String s="{{}{";
		Stack<Character> st=new Stack<>();
		int l=s.length();
		if(l%2!=0)System.out.println("not possible");
		
		for(int i=0;i<l;i++) {
			
			if(s.charAt(i)=='}' && !st.isEmpty()) {
				
				if(st.peek()=='{') st.pop();
				else st.push(s.charAt(i));
				
			}else {
				st.push(s.charAt(i));
			}
		
		
		}
		int stack_length=st.size();
		int n=0;
		while(!st.isEmpty() && st.peek()=='{') {
			st.pop();
			n++;
		}
		System.out.println(stack_length/2+n%2);

		

	}

}
