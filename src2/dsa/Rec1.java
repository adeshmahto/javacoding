package dsa;

public class Rec1 {
	public static void main(String[] args) {
		A(2);
	
	}
	static void A(int n) {
		if(n>0) {
			A(n-1);
		System.out.print(n);
		A(n-1);
		}
	}

}
