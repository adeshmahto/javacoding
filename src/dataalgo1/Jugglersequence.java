package dataalgo1;

public class Jugglersequence {

	public static void main(String[] args) {
		
		js(6);

	}
	public static void js(int n) {
		int a=n;
		System.out.println(a);
		
		while(a!=1) {
			
			int b=0;
			
			if((a&1)==0) {
				
				b=(int)Math.floor(Math.sqrt(a));
			}
			else {
				b= (int) ((int )Math.floor(Math.sqrt(a))*Math.sqrt(a)*Math.sqrt(a));
			}
			
			System.out.println(b +" ");
			a=b;
		}
	
		
		
		
	}
	

}
