package algo;

import java.util.Scanner;

public class CountBinarystring {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
//		int dp0[]=new int [n+1];         // for zeros
//		int dp1[]=new int[n+1];        // for ones
//		// dp as two  1d array
//		dp0[1]=1;
//		dp1[1]=1;
//		for(int i=2;i<=n;i++) {
//			dp0[i]=dp1[i-1];
//			dp1[i]=dp1[i-1]+dp0[i-1];
//		}
//		System.out.println(dp1[n]+dp0[n]);
		
		// 2nd method without array
		int oczeros=1;                      // old count zeros
		int ocones=1;						// old count ones
		for(int i=2;i<=n;i++) {
			int nczeros=ocones;
			int ncones=oczeros+ocones;
			
			oczeros=nczeros;
			ocones=ncones;
		}
		System.out.println(oczeros+ocones);
		
		
		
}
	
	
	

}
