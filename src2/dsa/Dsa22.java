package dsa;

public class Dsa22 {

	public static void main(String[] args) {
		int A= 3;
		   long rev = 0;
		    
		    for (int i = 0; i < 32; i++) {
		        rev <<= 1;
		       System.out.println( rev);
		        if ((A & (1 << i)) != 0)
		            rev++;
		       // System.out.println( rev);
		    }
		    
		  
		  
		  System.out.println(rev);
		
	

}
}