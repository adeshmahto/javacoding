package algo;

import java.util.Scanner;

public class PaintmanyhouseOptimized {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
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
			
			int least=Integer.MAX_VALUE;
			int sleast=Integer.MAX_VALUE;
			
			for(int i=0;i<arr[0].length;i++) {
				dp[0][i]=arr[0][i];
				
				if(arr[0][i]<=least) {
					sleast=least;
					least=arr[0][i];
				}
				else if(arr[0][i]<=sleast) {
					sleast=arr[0][i];
				}
				
			}
			for(int i=1;i<dp.length;i++) {
				int nleast=Integer.MAX_VALUE;
				int nsleast=Integer.MAX_VALUE;
				
				for(int j=0;j<dp[0].length;j++) {
					
					if(least==dp[i-1][j]) {
						dp[i][j]=sleast+ arr[i][j];
					}else {
						dp[i][j]=least+ arr[i][j];
					}
					
					if(arr[i][j]<=nleast) {             // least and second least finding during filling column
						nsleast=nleast;
						nleast=arr[i][j];
					}
					else if(arr[i][j]<=nsleast) {
						nsleast=arr[i][j];
					}
				}
				least=nleast;
				sleast=nsleast;
			}
			System.out.println(least);
		}
		

	}

}
