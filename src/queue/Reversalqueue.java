package queue;

public class Reversalqueue {

	public static void main(String[] args) {
		String s="}{{}}{{{";
		int count=0;
		int open=0;
		int i;

		if(s.length()%2!=0) {
			System.out.println(-1);
	    }
		for( i=0;i<s.length();i++) {
			if(s.charAt(i)=='{') {
				open++;
				
			}
			else if(s.charAt(i)=='}'  ) {
			open--;
				
			}
			else {
				open++;
				count--;
			}
			
			count+=open/2;
		}
	
	
		
		
		
			System.out.println(2%2);
	
		

}
}
