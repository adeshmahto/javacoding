package deque;

import java.util.ArrayDeque;

public class MyArraydeque {

	public static void main(String[] args) {
		ArrayDeque<Integer> ad=new ArrayDeque<>();
		ad.add(23);
		ad.add(26);
		ad.add(28);
		ad.addFirst(56);
		System.out.println(ad.getFirst());
		System.out.println(ad.getLast());
		
		
		

	}

}
