package heap;

class Heapimpl{
	int size;
	int [] arr=new int [20];
	
	public void insertNewvalue(int val) {                // making heap
		arr[size]= val;
		int index=size;
		int parent=(index-1)/2;
		
		while(parent>=0 && arr[parent]<arr[index]) {
			int t=arr[parent];
			arr[parent]=arr[index];
			arr[index]=t;
			
			t=parent;
			index=parent;
			parent =(t-1)/2;
			
		}
		size++;
	}
	public int getMax() {
		return arr[0];
	}
	public int removemax() {
		int max =arr[0];
		arr[0]=arr[size-1];
		size=size-1;
		maxheapify(0);
		return max;
		
	}
	
	public void maxheapify(int index) {
		int l,r;
		l=2* index +1;
		r=2* index+2;
		
		int larger=index;
		if(l<this.size && arr[l]> arr[larger]) {
			larger=l;
		}
		if(r<this.size && arr[r]> arr[larger]) {
			larger=r;
		}
		
		if(larger!=index) {
			int t=arr[larger];
			arr[larger]=arr[index];
			arr[index]=t;
			maxheapify(larger);
		}
	}
	public void buildmaxheap(int []arr) {
		this.arr=arr;
		this.size=arr.length;
		for(int i=size/2-1 ;i>=0;i--) {
			maxheapify(i);
		}
	}
	}
	public class HeapApp{
	public static void main(String[] args) {
		Heapimpl a=new Heapimpl();
		int arr[]= {10,7,11,30};
		a.buildmaxheap(arr);
		
		a.insertNewvalue(arr[0]);
		a.insertNewvalue(arr[1]);
		a.insertNewvalue(arr[2]);
		System.out.println(a.getMax());
	
	
	}
	
	}
	
 
 
 








