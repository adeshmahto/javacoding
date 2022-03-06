package dsa;

public class Randomfuction {

	public static void main(String[] args) {
	   
System.out.println(isPrime(7));

	}
	public static int  isPrime(int n ) {
		int flag=0;
		for(int i=2;i<n;i++) {
			if(n%i==0)   return 0;
		
		}
	return 1;
		
	}

}
