package mynewjava;

public class Firstvideo {

	public static void main(String[] args) {
		int [] arr = {1,2,3,4,4,5};
		for(int e: arr) {
			if((e & 1)==0) {
				System.out.println("it is even number"  + e);
				
			}else {
				
				System.out.println("it is not a even number" + e);
			}
			
			
		}

	}

}
