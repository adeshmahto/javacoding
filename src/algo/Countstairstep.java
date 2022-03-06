package algo;

import java.util.Scanner;

public class Countstairstep {

	public static void main(String[] args) {
		System.out.println("enter the nulmber:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		//System.out.println(countpath(n,new int[n+1]));
		System.out.println(countpathTab(n));

	}
	public static int countpath(int n,int qb[]) {       // memorization
		if(n==0)
			return 1;
		else if(n<0)
			return 0;
		if(qb[n]!=0) {
			return qb[n];
		}
		int n1=countpath(n-1,qb);
		int n2=countpath(n-2,qb);
		int n3=countpath(n-3,qb);
		int cp=n1+n2+n3;
		qb[n]=cp;
		return cp;
	}
	public static int countpathTab(int n) {        // Using tabulation
		
		int dp[]=new int [n+1];
		dp[0]=1;
		for(int i=1;i<=n;i++) {
			if(i==1) {                             // exception handling
				dp[i]=dp[i-1];
			}else if(i==2) {
				dp[i]=dp[i-1]+dp[i-2];
			}else {
				dp[i]=dp[i-1]+dp[i-2]+dp[i-3];
			}
		}
		return dp[n];
		
	}
	

}
