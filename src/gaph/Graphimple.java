package gaph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Graphimple {
	
	private LinkedList<Integer> adj[];
	public Graphimple(int v) {
		adj=new LinkedList[v];
		for(int i=0;i<v;i++) {
			adj[i]=new LinkedList<Integer>();
		}
	}
	public void addEdge(int source, int destination) {
		adj[source].add(destination);
		adj[destination].add(source);
	}
	public int bfs(int source, int destination) {
		boolean vis[]=new boolean[adj.length]; // marking the visited node
		int parent[]=new int[adj.length];         // array to mark the  distance
		Queue<Integer>q=new LinkedList<>();
		q.add(source);
		parent[source]=-1;  // 1st node introducer
		vis[source]=true;
		
		while(!q.isEmpty()) {
			int cur =q.poll();
			if(cur==destination) break;
			
			for(int neighbour: adj[cur]) {            // linkedlist show the how far we go 
				if(!vis[neighbour]) {  // if we not visited the node before so insert in the queue
					vis[neighbour]=true;
					q.add(neighbour);
					parent[neighbour]=cur;            // marking the parent of the node 
					
					
				}
			}
		}
		int cur=destination;
		int distance=0;
		
		while(parent[cur]!=-1) {         // print the whole destination
			System.out.print(cur+"->");
			cur=parent[cur];
			distance++;
			
		}
		return distance;
		
		
		}
	private boolean dfsUtil(int source,int destination, boolean vis[]) { // recursive method
		if(source==destination) return true;
		
		for(int neighbour: adj[source]) {
			if(!vis[neighbour]) {
				vis[neighbour]=true;
				boolean isConnected= dfsUtil(neighbour,destination, vis);
				if(isConnected) return true;
			}
		}
		return false;
	}
	public boolean dfs(int source,int destination) {
		boolean vis[]=new boolean[adj.length];
		vis[source]=true;
		return dfsUtil(source,destination,vis);
	}
	public boolean dfsStack(int source,int destination) {
		boolean vis[]=new boolean[adj.length];
		vis[source]=true;
		Stack<Integer> stack=new Stack<>();
		stack.push(source);
		
		while(!stack.isEmpty()){
			int cur=stack.pop();
			if(cur==destination) return true;
			
			for(int neigh:adj[cur]) {
				if(!vis[neigh]) {
					vis[neigh]=true;
					stack.push(neigh);
				}
			}
			
		}
		return false;
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of vertices and edges:");            // space leke v kr sakta hai
		int v=sc.nextInt();
		int e=sc.nextInt();
		Graphimple graph= new Graphimple(v);
		System.out.print("Enter "+ e + " edges");
		for(int i=0;i<e;i++) {
			int source=sc.nextInt();
			int destination = sc.nextInt();
			
			graph.addEdge(source, destination);                 
			
		}
		System.out.println("Enter source and distination:");
		
		int source =sc.nextInt();
		int destination=sc.nextInt();
		
	
	//	int distance=graph.bfs(source, destination);
		//System.out.println("min distance is "+ distance);
		sc.close();
		System.out.println("possible " + graph.dfs(source, destination));
		System.out.println("possible " + graph.dfsStack(source, destination));
		
	

	}

}
