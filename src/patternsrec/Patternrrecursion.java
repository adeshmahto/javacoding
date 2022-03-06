package patternsrec;

public class Patternrrecursion {

	public static void main(String[] args) {
	
		
		ptt(3);

	}
	public static void ptt(int n) {
		if(n==0) {
			System.out.print("*");
			return ;
		}
		ptt(n-1);
		for(int i=0;i<2*n-1;i++) {
			System.out.print("*");
			
		}
		   System.out.print(" \n ");
	}

}
