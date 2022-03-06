package mynewjava;

public class Pracrec {
	
	static int count(int n , int m) {
		if (n==1||n==2) {
			return 1;
		}else
			return count(n-1,m)+count(m,n-1);
		
		
	}
	

	public static void main(String[] args) {
	System.out.println(count (1,1));

	}

}
