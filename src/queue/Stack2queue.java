package queue;

import java.util.Stack;
import java.util.Vector;

public class Stack2queue {

	public static void main(String[] args) {
		int arr[]= {6, 8, 0 ,1 ,3};
		
		
	     Stack<Integer> s = new Stack<>();
	        int nge[] = new int[arr.length];
	 
	        // iterate for rest of the elements
	        for (int i = arr.length - 1; i >= 0; i--)
	        {
	            /* if stack is not empty, then
	            pop an element from stack.
	            If the popped element is smaller
	            than next, then
	            a) print the pair
	            b) keep popping while elements are
	            smaller and stack is not empty */
	            if (!s.empty())
	            {
	                while (!s.empty()
	                       && s.peek() <= arr[i])
	                {
	                    s.pop();
	                }
	            }
	            nge[i] = s.empty() ? -1 : s.peek();
	            s.push(arr[i]);
	        }
	        for (int i = 0; i < arr.length; i++)
	            System.out.println(arr[i] +
	                               " --> " + nge[i]);
	    }
	 
		
		
	}
	


	


