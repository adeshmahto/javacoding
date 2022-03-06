package arraysalgo;

import java.util.Scanner;

public class Buyandsell_k_transction {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of days:");
		int n=sc.nextInt();
		System.out.println("enter the number of transaction");
		int k=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int dp[][]=new int[k+1][n];
		
		
		for(int i=0;i<=k;i++) {
			for(int j=0;i<arr.length;j++) {
				int max=0;
				if(i==0) {
					dp[i][j]=0;
				}else if(j==0) {
					dp[i][j]=0;
				}else {
					if(i-j>0) {
					
					if(dp[i-j][i-j]+arr[i]+arr[i-j]>max) {
						max=dp[i-j][i-j]+arr[i]+arr[i-j];
					}
					
					
					
					}

				}
				int max1=Math.max(max, dp[i][j-1]);
				dp[i][j]=max1;
				
			}
		}
		System.out.println(dp[k+1][n]);
	
		
		
		

	}

}
