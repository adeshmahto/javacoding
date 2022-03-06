package dsa;

public class Dsa3 {

	public static void main(String[] args) {
		long a=3;                        // counting the bits
		
	     long count =0;
	        
         while( a!=0){
             
             a &=(a-1);
             count++  ;
           
         }
         System.out.println(count);
     
	}

}
