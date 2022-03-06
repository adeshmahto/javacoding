package vectorandstack;

import linkedlist.Mylinkedlist;
import linkedlist.Mystacklinkedlist;

public class Mystack<E> {
	
        private Mystacklinkedlist<E> ll=new Mystacklinkedlist<>();
	
	void push(E e) {
		
		ll.add(e);
		
	}
	
	E pop() throws Exception {
		if(ll.isEmpty()) {
			throw new Exception("popping from empty stack is not allowed ");
		}
		return ll.removeLast();
	}
	
	E peek() throws Exception {
		if(ll.isEmpty()) {
			throw new Exception("peeking from empty stack is not allowed ");
		}
		return ll.getLast();
	}
	

}
