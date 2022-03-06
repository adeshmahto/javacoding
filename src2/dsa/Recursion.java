package dsa;

public class Recursion {

	public static void main(String[] args) {
		int c=Pow(3,4);
		System.out.println(c);
		
	 

	}
	
	static int Pow(int a, int b) {
		
		if(b==0) {
			
			return 1;
		}
		
		return (int) (Math.pow(a, b-1) * a);
		
	}

}
