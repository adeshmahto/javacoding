package linkedlist;

import linkedlist.Mystacklinkedlist.Node;

public class Myqueuelinkedlist <E> {
	Node <E>head;
	public boolean isEmpty() {                            
		
		return head==null;
	}
	public static class Node<E>{
		public E data;                                  
		public Node<E> next;
		
		public Node(E data) {                
			this.data= data;
			next=null;
		}
	}

}
