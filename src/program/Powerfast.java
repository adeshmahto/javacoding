package program;

public class Powerfast {

	public static void main(String[] args) {
		
      System.out.println(powerfast(100000000,5,100000000));
	}public static long powerfast(long a, long b,long n) {
		long res=1;
		while(b>0) {
		if((b&1)!=0) {
			res=(res*a%n)%n;
			
		}
		a=(a%n*a%n)%n;
		b=b>>1;
		}
		return res;
	}
	
}
