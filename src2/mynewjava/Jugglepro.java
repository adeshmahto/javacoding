package mynewjava;

public class Jugglepro {

	public static void main(String[] args) {

	jp(9);
	}
	public static void jp(int a) {
		if(a==1) {
			System.out.println(a) ;
		return  ;}
		
		if((a&1)==0) {
			System.out.println(a);
			
			int b= (int )Math.pow(a, 0.5);
			jp(b);
			
		}
		else  {
			
			System.out.println(a);
			int b= (int )Math.pow(a, 1.5);
			 jp(b);
			
			
		}
	}
	

	}
	


