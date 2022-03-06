package dsa;

public class Pmax {

	public static void main(String[] args) {
		int []arr= {5,-4,-2,6,-1};
		int n=5;
		System.out.println(kadane(arr,n));
	}
	 public static int kadane(int a[],int n){
	        int res = 0;
	        int x =  a[0];
	        for(int i = 0; i < n; i++){
	            res = Math.max(a[i],res+a[i]);
	            x= Math.max(x,res);
	        }
	        return x;

}}
