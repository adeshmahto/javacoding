package dsa;

public class TowerNHonoi {

	public static void main(String[] args) {
		
		System.out.println(Honoi(2,'A','B','C'));
	}
	
	public static long Honoi(int n,char A,char B,char C) {
		int Movement=0;
		int temp=n;
		if(n==1) {
			System.out.println("Move disc  "+ n + A +" to "+ C);
			return n;
		
		}
		
		Honoi(n-1,A,C,B);
		System.out.println("Move disc of "+ n + A +" to "+C);

		Honoi(n-1,B,A,C);
		
		n=temp;
		Movement=(int)Math.pow(2, n)-1;
		
		
		return Movement;
		
	}
	

}
