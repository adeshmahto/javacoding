package mynewjava;

public class Rec2 {
	
	static int powf(int a,int b) {
		if(b==0)
			return 1;
		else
			return (int) (Math.pow(a, b-1)*a);
		
	}

	public static void main(String[] args) {
		
		System.out.println(powf(3,4));
		

	}

}
