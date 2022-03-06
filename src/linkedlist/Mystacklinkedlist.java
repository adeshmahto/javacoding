package linkedlist;

import linkedlist.Mylinkedlist.Node;

public class Mystacklinkedlist<E> {
	Node <E> head;
	
	public void add(E e) {                
		Node toAdd= new Node(e);
		
		if(isEmpty()) {
			head=toAdd;              
			return;
		}
		
		Node temp =head;
		while(temp.next!=null) {
			temp=temp.next;                   
		}
		temp.next=toAdd; 
		
		
	}
	public E removeLast() throws Exception {
		Node<E> temp=head;
		
		
		if(temp==null) {                           // if nothing is there the it will show warnning 
			throw new Exception("cannot remove last element from stack");
		}
		
		if(temp.next==null) {           // if only one element is there 
			Node <E>toremove=head;          // store that element in the toremove
			head=null;                       // delete that element
			return toremove.data;         // it will return the data of that element
		}
		
		while(temp.next.next!=null) {
			temp=temp.next;
		}
		Node<E> toremove=temp.next;                // store the last element in toremove 
		temp.next=null;
		return toremove.data;
		
		
	}
	
	public  E getLast() throws Exception{
		Node<E> temp=head;
		if(temp.next==null) {
			throw new Exception("cannot peek last element from empty stack");
		}
		while(temp.next!=null) {              // reach to last element
			temp=temp.next;
		}
		return temp.data;                  // return the of last element of data. 
		
	}
		
		public boolean isEmpty() {                            
			
			return head==null;
		}
		public static class Node<E>{
			E data;                                  
			Node<E> next;
			
			public Node(E data) {                
				this.data= data;
				next=null;
			}
		}

}
