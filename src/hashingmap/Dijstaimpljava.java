package hashingmap;

import java.util.Scanner;

public class Dijstaimpljava {
	
	private static void dijstra(int [][] adjacencymatrix) {
		
		int v=adjacencymatrix.length;
		boolean visited[]=new boolean[v];
		int distance[]=new int [v];
		distance[0]=0;                        // source should be 0 initially
		
		for(int i=1;i<v;i++) {
			distance[i]=Integer.MAX_VALUE;              // infinity
			
		}
		for(int i=0;i<v-1;i++) {
			// find min-distance vertex
			
			int minvertex=findMinVertex(distance,visited);
			visited[minvertex]=true;
			//   explore neighbour
			for(int j=0;j<v;j++) {
				if(adjacencymatrix[minvertex][j]!=0 && !visited[j] && distance[minvertex]!=Integer.MAX_VALUE) {
					int newdist=distance[minvertex]+ adjacencymatrix[minvertex][j];
					if(newdist<distance[j]) {
						distance[j]=newdist;
					}
				}
			}
			
		}
		//print
		for(int i=1;i<v;i++) {
			System.out.println(i+" "+ distance[i]);
		}
		
		
	}
	private static int findMinVertex(int[] distance,boolean visited[]) {// minvertex=0,1,2,3,4
		int minVertex=-1;
		for(int i=0;i<distance.length;i++) {
			if(!visited[i] && (minVertex==-1||distance[i]<distance[minVertex])) {
				minVertex=i;
			}
		}
		return minVertex;
		
	}

	public static void main(String[] args) {
	
		Scanner s=new Scanner(System.in);
		int v=s.nextInt();
		int e=s.nextInt();
		int adjacencymatrix[][]=new int [v][v];
		for(int i=0;i<e;i++) {
			int v1=s.nextInt();
			int v2=s.nextInt();
			int weight=s.nextInt();
			adjacencymatrix[v1][v2]=weight;
			adjacencymatrix[v2][v1]=weight;
		}
		dijstra(adjacencymatrix);

	}

}
