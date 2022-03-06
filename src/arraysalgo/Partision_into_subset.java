package arraysalgo;

import java.util.Scanner;

public class Partision_into_subset {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the no. of people:");
		int n=sc.nextInt();          // column
		System.out.println("enter the no. of group:");
		int k=sc.nextInt();			// row
		
		
		
		int dp[][]=new int[k+1][n+1];
		if(n==0 || k==0|| n<k) {
			System.out.println(0);
			return;
		}
		
		
		for(int i=1;i<=k;i++) {
			for(int j=1;j<=n;j++) {
				if(i==1) {
					dp[i][j]=1;
				}else if(i>j){
					dp[i][j]=0;
					
				}else if(i==j) {
					dp[i][j]=1;
				}else {
					dp[i][j]=dp[i-1][j-1]+i*(dp[i][j-1]);
				}
			}
			
		}
		System.out.println("<--no of way they formed-->");
		System.out.println(dp[k][n]);
		
	}

}
