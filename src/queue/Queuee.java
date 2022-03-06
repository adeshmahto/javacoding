package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Queuee {

	public static void main(String[] args) {
		
          
          
       
        
        
       
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(10);
        s.push(3);
        s.push(9);   
        s.push(7);
        int size=s.size();
        int [] arr=new int [size];
        
        for(int i=0;i<size ;i++) {
        	arr[i]=s.pop();
        }
        for(int i=0;i<size-1;i++) {
        	for(int j=0;j<size-1;j++) {
        		if(arr[j]>arr[j+1]) {
        			arr[j]=arr[j]^arr[j+1];
        			arr[j+1]=arr[j]^arr[j+1];
        			arr[j]=arr[j]^arr[j+1];
        			
        		}
        	}
        }
        for(int i=0;i<size;i++) {
        	s.add(arr[i]);
       }
        for(int i=0;i<size;i++) {
        System.out.println(s.pop());
       }
       
   
       
       
       
        
        
 
    
        
          
         
          
    
          
        
	}

}
