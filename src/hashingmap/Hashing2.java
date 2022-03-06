package hashingmap;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Hashing2 {
 
	public static void main(String[] args) {
		
	    Queue<Character> st=new LinkedList<>();
		String a="GEEKS FOR GEEKS";
		
		
		
		char[] ch=a.toCharArray();
		
		for(int i=ch.length-1;i>=0;i-- ) {
			
			if(!st.contains(ch[i] )  && ch[i]!=' ' ) {
				st.add(ch[i]);
			}
			
			
		}
		String s1="";
		
		while(!st.isEmpty()) {
			s1=s1+st.remove();
		}
		System.out.print(s1);
	
	
	
	
		
	
		
	    
		
		
		
		
	
			

	}

}
