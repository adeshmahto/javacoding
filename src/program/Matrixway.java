package program;

public class Matrixway {

	public static void main(String[] args) {
		System.out.println(count(2,2));

	}public static int count(int n,int m) {
		if (n==1||m==1) return 1;
		return count(n,m-1)+count(n-1,m);
	}

}
