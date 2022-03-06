package stringint;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Linkedlist {

	public static void main(String[] args) {
	
		List<Integer> ll1 =new LinkedList<>();
		List<Integer> ll2 =new LinkedList<>();
	int x=5;
	int count=0;
		int sum=0;
		ll1.add(3);
		ll1.add(1);
		ll1.add(4);
		ll2.add(4);
		ll2.add(1);
		ll2.add(5);
		ll2.add(2);
		Iterator <Integer>it1=ll1.iterator();
		
		
		System.out.println();
	
		
		while(it1.hasNext()) {
			
			Iterator <Integer>it2=ll2.iterator();
			int t= it1.next();
			while(it2.hasNext()) {
				if((t +it2.next())==x) count++;
			}
		}
	//	System.out.println(count);

		
	}
//	static void getTimediff(List<Integer> List) {
//		
//		long start = System.currentTimeMillis();
//		for(int i=0;i<100000;i++) {
//			List.add(0,i);
//			
//		}
//		
//		long end =System.currentTimeMillis();
//		System.out.println(List.getClass().getName()+ "-->"+ (end-start));
//		
//	}

}
