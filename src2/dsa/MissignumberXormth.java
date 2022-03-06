package dsa;

public class MissignumberXormth {

	public static void main(String[] args) {
	
		int []arr= {0,-1,-2,1,3};
		//Mss(arr);
		System.out.println(Mss(arr));
	}
	public static int Mss(int []arr) {
		int x1=arr[0];
		int n=arr.length;
		int x2=1;
		for(int i=1;i<n;i++) {
			x1=x1^arr[i];
		}
		for(int i=2;i<=n+1;i++) {
			x2=x2^i;
		}
		return (x1^x2);
	}

}
