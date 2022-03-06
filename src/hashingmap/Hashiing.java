package hashingmap;

import java.util.HashSet;

public class Hashiing {

	public static void main(String[] args) {
		
		HashSet<Integer>s=new HashSet<>();
		int a[]= {1,2,3,4,5,6};
		int b[]= {1,2,3,4};
		for(int e: a) {
			s.add(e);
		}
			int count=0;
		
		for(int e: b) {
			if(s.contains(e)) {
				count++;
				s.remove(e);
			}
			
		}
		System.out.println(count);
	    
		
	
	
		
	
		

	}

}
