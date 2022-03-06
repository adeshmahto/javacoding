package algo;

import java.util.Scanner;

public class Method2forpainhouse {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no. of house:");
		int n=sc.nextInt();
		System.out.println("Enter the no. of color");
		int m=sc.nextInt();
		int arr[][]=new int [m][n];
		System.out.println("enter the colors:");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		int dp[][]=new int[m][n];
		for(int i=0;i<m;i++) {
			dp[0][i]=arr[0][i];
		}
		
		for(int i=1;i<n;i++) {
			dp[0][i]=arr[0][i]+Math.min(dp[1][i-1], dp[2][i-1]);
			dp[1][i]=arr[1][i]+Math.min(dp[0][i-1], dp[2][i-1]);
			dp[2][i]=arr[2][i]+Math.min(dp[0][i-1], dp[1][i-1]);
		}
	
		
		int min=Math.min(dp[0][n-1], dp[1][n-1]);
		int result=Math.min(dp[2][n-1] ,min);
		System.out.println("anwer-->");
		System.out.println(result);
		
		
		

	}

}
