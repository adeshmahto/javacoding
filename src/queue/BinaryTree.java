package queue;

import java.util.PriorityQueue;
import java.util.Scanner;

public class BinaryTree {

	static Scanner sc=null;
	public static void main(String[] args) {
		sc=new Scanner(System.in);
	Node root=createTree();
	
	//TripO(root);
//	InOrder(root);
//	System.out.println();
//	PreOrder(root);
//	System.out.println();
//	PostOrder(root);
//    System.out.println();
//	System.out.println(Heighttree(root));
//	System.out.print(count(root)+" ");
//	System.out.print(countleaf(root)+" ");
//	System.out.print(countNonleaf(root)+" ");
	System.out.println(fullNode(root));
			
	}
	
	
	static Node createTree() {
		
		
		
		Node root=null;
		System.out.println("Enter the data: ");  // root data
		int data=sc.nextInt();
		
		 if(data==-1) return null;
		 
		 root =new Node(data);            //creat new root(new node);
		 
		 System.out.println("Enter left for " + data);
		 root.left=createTree();          // left node ;
		 
		 System.out.println("Enter right for " +data);
		 root.right=createTree();        // right node;
		 return root;
		 
	}
	static void InOrder(Node root) {
		if(root==null) return ;
		InOrder(root.left);
		System.out.print(root.data +" ");
		InOrder(root.right);		
	}
	static void PreOrder(Node root) {
		if(root==null) return ;
		System.out.print(root.data +" ");
		PreOrder(root.left);
		PreOrder(root.right);		
	}
	static void PostOrder(Node root) {
		if(root==null) return ;
		PostOrder(root.left);
		PostOrder(root.right);
		System.out.print(root.data +" ");
		
	}
	static void Doubleorder(Node root) {
		if(root==null) return;
		System.out.println(root.data +" ");
		Doubleorder(root.left);
		System.out.println(root.data +" ");
		Doubleorder(root.right);
		
	}
	
	static void TripO(Node root) {
		if(root==null) return;
		System.out.println(root.data+" ");
		TripO(root.left);
		System.out.println(root.data+" ");
		TripO(root.right);
		System.out.println(root.data+" ");
		
	}
	static int Heighttree(Node root) {
		if(root==null) return 0;
		int lh=Heighttree(root.left);
		int rh=Heighttree(root.right);
		return 1+ Math.max(lh, rh);
		
	}
	static int count(Node root) {
		if(root!=null) {
			int lh=count(root.left);
			int rh=count(root.right);
			return (1+lh+rh);
		}
		else {
			return 0;
		}
	}
 static int countleaf(Node root) {
	 if(root==null) return 0;
	 if(root.left==null && root.right==null) return 1;
	 else return countleaf(root.left)+countleaf(root.right); 
 }
 static int countNonleaf(Node root) {
	 if(root==null) return 0;
	 if(root.left==null && root.right==null) return 0;
	 else return (1+countNonleaf(root.left)+countNonleaf(root.right));
 }
 static int fullNode(Node root) {
	
	 if(root==null) return 0;
	 if(root.left==null && root.right==null) return 1;
	 return fullNode(root.left)+fullNode(root.right)+((root.left!=null && root.right!=null)?1:0);
 }
        

}
class Node{
	Node left,right;
	int data;                     // integer type
	public Node(int data) {
		this.data=data;
	}
}
