package algo;

import java.util.Scanner;

public class Paint_Many_House {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no. of house:");
		int n=sc.nextInt();
		System.out.println("Enter the no. of color");
		int m=sc.nextInt();
		int arr[][]=new int [n][m];
		System.out.println("enter the colors:");
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		int dp[][]=new int[arr.length][arr[0].length];
		
		for(int i=0;i<arr[0].length;i++) {
			dp[0][i]=arr[0][i];
			
		}
		for(int i=1;i<dp.length;i++) {
			for(int j=0;j<dp[0].length;j++) {
				
				int min=Integer.MAX_VALUE;//}
				for(int k=0;k<dp[0].length;k++) {//min finder 
					if(k!=j) {
						if(dp[i-1][k]<min) {
							min=dp[i-1][k];
						}
					}
				}                           //}
				dp[i][j]=arr[i][j]+min;
				
			}
		}
		int min=Integer.MAX_VALUE;
		for(int k=0;k<dp[0].length;k++) {
				if(dp[n-1][k]<min) {
					min=dp[n-1][k];
				}
			}
		System.out.println("answer-->");
		System.out.println(min);
		
		

	}

}
