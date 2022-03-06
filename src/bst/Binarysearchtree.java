package bst;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Node{
	int data;
	Node left;
	Node right;
}

class BST{

	public Node createNewNode(int k) {
		Node a=new Node();
		a.data=k;
		a.left=null;
		a.right=null;
		return a;
	}
	public Node insert(Node node,int val) {             // return node not int 
		if(node==null) {
			return createNewNode(val);
		}
		if(val<node.data) {
			node.left=insert(node.left,val);
		}else if(val>node.data) {
			node.right=insert(node.right,val);
		}
		return node;
	}
	public Node delete(Node node, int val) {
		if(node==null) {
			return null;
		}
		if(val<node.data) {
			node.left=delete(node.left,val);
		}
		else if(val>node.data) {
			node.right=delete(node.right,val);
			
		}else {
			if(node.left==null || node.right==null) {       // cheaking leaf
				Node temp= null;
				temp=node.left==null? node.right:node.left;  // if left is not null then right go
				
				if(temp==null) {    // if both left and right is null or leaf
					return null;
				}else {
					return temp;     // its mean either left or right is there
				}
				
				
			}else {
				Node successor=getsuccessor(node); // node creater
				node.data=successor.data;         // 3 become 4
				node.right=delete(node.right,successor.data); ;     // 4 will delete
			}
		}
		return node;
	}
	public Node getsuccessor(Node node) {       // it will give the left leaf;
		if(node==null) {
			return null;
		}
		Node temp=node.right;
		while(temp.left!=null) {
			temp=temp.left;      // 
		}
		return temp;                // return the leaf (last node)
	}
	
	
	public void inorder(Node node) {

		if(node==null) {
			return;
		}
		inorder(node.left);
		System.out.println(node.data+" ");
		inorder(node.right);
		
		
	}
	
	
	   
	
	

	
	public void postorder(Node node) {
		if(node==null) return;
		postorder(node.left);
		postorder(node.right);
		System.out.println(node.data+" ");
	}
	public int count(Node node) {
	if(node==null) return 0;
		int ls=count(node.left);
		int rs=count(node.right);
		return(1+ls+rs);
	}
	public int leaf(Node node) {
		if(node==null) return 0;
		if(node.left==null && node.right==null) return 1;
	    return leaf(node.left)+leaf(node.right);
	    
	}
	public int nonleaf(Node node) {
		if(node==null) return 0;
		if(node.left==null && node.right==null) return 0;     // ignore non-leaf
		return 1+nonleaf(node.left)+nonleaf(node.right);
	}
	public int fullnode(Node node) {
		if(node==null) return 0;
		if(node.left==null && node.right==null) return 0;
		return fullnode(node.left)+fullnode(node.right)+((node.left!=null && node.right!=null)?1:0);
	}
	
	public boolean search(Node node,int key) {
		if(node==null) return false;
		else if(key==node.data) return true;
		else if(key>node.data) return search(node.right,key);
		else return search(node.left,key);
	}

public boolean iscomplete(Node node) {
	if(node==null) return true;
	if(node.left==null && node.right==null) return true;
	else if(node.left!=null && node.right!=null) return iscomplete(node.left ) && iscomplete(node.right);
	else return true;
}

}
	
public class Binarysearchtree {
	public static void main(String[] args) {
		BST a=new BST();
		Node root=null;
		  
  
		
		root=a.insert(root, 20);
		root=a.insert(root, 15);
		root=a.insert(root, 30);
		root=a.insert(root, 40);
		root=a.insert(root, 60);
		root=a.insert(root, 25);
		root=a.insert(root, 10);
		a.delete(root ,15); 

		
	
	
         
      
	}
	

}
