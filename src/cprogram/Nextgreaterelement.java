package cprogram;

import java.util.Stack;

public class Nextgreaterelement {

	public static void main(String[] args) {
		
		int arr[]= {11,13,21,3};
		NGE(arr);
		


	}public static void NGE(int arr[]) {
		
		int nge[]=new int[arr.length];
		Stack<Integer> s=new Stack<>();
		for(int i=arr.length-1;i>0;i--) {
			if(!s.empty()) {
				while(!s.empty() && s.peek()<=arr[i]) {
					s.pop();
				}
				nge[i]=s.empty()?-1:s.peek();
				s.push(arr[i]);
			}
		}
		
		for(int e:nge) {
			System.out.println(nge[e]);
		}
		
	}

}
