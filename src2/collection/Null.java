package collection;

public class Null {

	public static void main(String[] args) {
	rec(2);
		
	}
	static void rec(int n) {
		
		if(n>0) {
			rec(n-1);
			System.out.println(n);
			rec(n-1);
		}
		
		
	}

}
