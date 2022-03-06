package dsa;

public class Polindrone {

	public static void main(String[] args) {

		int n=523;
	int sum=0;
	int r;
		
		while(n>0) {
			r=n%10;           //3              2
											  
			sum=sum*10+r;      //0+3=3         3*10+2=32
			n=n/10;             //52
			
		}
		System.out.println(                                  sum);
	
	}

}
