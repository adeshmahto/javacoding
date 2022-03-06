package dsa;

import java.util.Random;

public class Dsalgo2 {
	
	static int fun(int n) {
		Random rand = new Random();
		
		
		if(n<=0) {
			
			return 0;
		}else {
			
			int i = rand.nextInt(n);
			System.out.println("this");
			
			return fun(i)+fun(n-1-i);
		}
		
		
		
	}

	public static void main(String[] args) {
	
		
		int c= fun(6);
	}

}
