package queue;

import java.util.Stack;

public class Stockspanproblem {

	public static void main(String[] args) {
		Stack <Integer> stack=new Stack<>();
		
		int [] arr= {100 ,80 ,60 ,70 ,60 ,75 ,85};
		
		
	      int x;
		
		for(int i=0;i<arr.length;i++) {
			int span=0;
		for(int j=i;j>=0;j--) {
			
			if(arr[i]>=arr[j]) {
				span++;
				
			}else {
				break;
			}
	  
		}
	
		
		
		}
		
			
			
		}
	}


