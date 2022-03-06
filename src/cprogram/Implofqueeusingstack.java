package cprogram;

import java.util.Stack;

public class Implofqueeusingstack {

	public static void main(String[] args) {
		push(1);
		push(2);
		push(3);
		System.out.println(pop());
		System.out.println(pop());
		System.out.println(pop());
	}
	
	static Stack<Integer>st1=new Stack<>();
     static  Stack<Integer>st2=new Stack<>();
	
	public static void push(int i) {
		st1.push(i);
		
	}
	public static int pop() {
		
		if(st2.isEmpty()) {
			if(st1.isEmpty()) {
				System.out.println("underflow condition");
			}else {
				
				while(!st1.isEmpty()) {
					st2.push(st1.pop());
				}
			}
			
		}
		return st2.pop();
	  
	
		
	}

}
