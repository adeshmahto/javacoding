package myDlinkedlist;

import linkedlist.Mylinkedlist.Node;

public class Mydoublelinkedlist {
	Node head;
	
	
	
	
	
	public void add(int data) {
		Node Newnode=new Node(data);
		Newnode.next=head;
		Newnode.prev=null;
		if(head!=null) {
			head.prev=Newnode;
			head=Newnode;
		}
	}
	
	
	boolean isEmpty() {                            
		if(head==null) {
			return true;
		}else {
			return false;
		}
	}
	static class Node{
		int data;                                 
		Node next;
		Node prev;
		
		public Node(int data) {                 
			this.data=data;
			next=null;
			prev=null;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	

	

}
