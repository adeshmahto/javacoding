package practice_inmethod;

public class Methodprac {
	
	static void pattern(int n){
		if(n>0 ) {
			pattern(n-1);       //          5 it will 4 now n = 4 so loop run for 0 to 4times ***** then n= 3 ,0 to 3 **** and so on.  
				for(int i=0; i<n; i++) {
					System.out.print("*");
					
				}
				System.out.println(" ");
			}
		
			
			
			

	
	}



	public static void main(String[] args) {

pattern(5);
	}

}
