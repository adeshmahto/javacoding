package dsa;

public class Matrix {

	public static void main(String[] args) {
   
		int c= count (4,3);
		System.out.println(c);
		
		

	}
	static int count(int n, int m) {
		
		if (n==1||m==1) {
			return 1;
		}
		
		return count(n-1,m)+count(m-1,n);
	}

}
