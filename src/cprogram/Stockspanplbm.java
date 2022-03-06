package cprogram;

import java.util.Stack;

public class Stockspanplbm {

	public static void main(String[] args) {
		
		int price[]= {100,80,60,70,85};
		int n=price.length;
		
		int i=0;
		while(i<n) {
		System.out.println(ssp(price,n)[i]);
		i++;
		
		}
		
		
		

	}
	
	 public static int[] ssp(int price[],int n) {
		 int span[]=new int[n];
		 Stack<Integer> stack=new Stack<>();
		 for(int i=0;i<n;i++) {
			 
			 while(!stack.isEmpty() && price[stack.peek()]<=price[i]) {
				 stack.pop();
			 }
			 span[i]=stack.isEmpty()?i+1:i-stack.peek();
			 stack.push(i);
		 }
		 return span;
		 
		 
	 }

}
