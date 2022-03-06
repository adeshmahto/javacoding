package arraysalgo;

public class Jugglersequence {

	public static void main(String[] args) {
		
		juggl(3);

	}
	public static void juggl(int n) {
		int a=n;
		int b;
		
		while(a!=1) {
			if((a&1)==0) {
			b=(int )Math.floor(Math.sqrt(a));
			}else {		
				b=(int )Math.floor(Math.sqrt(a)*3);
			}
			System.out.println(b +" ");
			a=b;
		}
		
		
	}

}
