package vargs;

public class Vargss {

	 static int pattern1( int a) {
		 if(a>0) {
			pattern1(a-1);
			
		 
		for(int i=a;i>1;i--) {
			System.out.print("*");
			
		}
		System.out.println("\n");
		
		}
		
return a;
	 }
	public static void main(String[] args) {
		
pattern1(3);

	
	}

}
