package bst;

public class Heapify {

	public static void main(String[] args) {
		
		int a[]= {20,10,30,5,50,40};
		int n=a.length;
		buildheap(a,n);
		
		for(int i=0;i<n;i++) {
			System.out.println(a[i]);
		}

	}
	public static void buildheap(int a[],int n) {
		for(int i=n/2-1;i>=0;i--) {     
			heapify(a,n,i);
		}
		for(int i=n-1;i>0;i--) {         // heapsorting 
		    a[0]=a[0]^a[i];
		    a[i]=a[0]^a[i];
	        a[0]=a[0]^a[i];		    
		    heapify(a,i,0);
		}
    }
	
	
	public static void heapify(int a[],int n,int i) {
		
		int largest =i;
		int l=2*i+1;
		int r=2*i+2;
		if(l<n && a[l]>a[largest]) {
			largest=l;
		}if(r<n && a[r]>a[largest]) {
			largest=r;
		}
		if(largest!=i) {
			a[i]=a[i]^a[largest];
			a[largest]=a[i]^a[largest];//swapping 
			a[i]=a[i]^a[largest];
			
			heapify(a,n,largest);
		}
	}
}
   
