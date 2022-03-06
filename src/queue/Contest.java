package queue;

import java.util.Stack;

public class Contest {

	public static void main(String[] args) {
		int [] arr= {4,7,5};
		  Stack<Integer> s=new Stack<>();
		   int k=3;
		   boolean f=false;
		   for(int i=0;i<arr.length;i++){
		       if(i<k){
		           s.push(arr[i]);
		           if(arr[k-1]>=arr[0] && arr[k-1]<=arr[1] && k==i) {
			    	   f=true;
			    	   break;
		         
		       }
		       }
		       else {
		           if(s.peek()>=arr[0] && s.peek()<=arr[1]) {
		               f=true;
		               break;
		               
		           }else{
		               s.pop();
		               s.push(arr[i]);
		           }
		           
		       }                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             
		   }
		
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(f);
	
		
	}

}
