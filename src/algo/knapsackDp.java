package algo;

import java.util.Scanner;

public class knapsackDp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the object:");
		int n=sc.nextInt();
		int weight[]=new int[n];
		int value[]=new int [n];
		System.out.println("Enter the weight and value:");
		for(int i=0;i<weight.length;i++) {
			weight[i]=sc.nextInt();
			value[i]=sc.nextInt();
		}
		System.out.println("Enter the max capicity of bag");
		int tar=sc.nextInt();
		int [][]dp=new int [n+1][tar+1];
		for (int i=1;i<dp.length;i++) {
			for(int j=1;j<dp[0].length;j++) {// j balls 
				//dp[i][j]=dp[i-1][j];    // when i doesnt bat!
				if(j>=weight[i-1]) {
					dp[i][j]=Math.max(dp[i-1][j-weight[i-1]]+value[i-1], dp[i-1][j]);
				}else {
					dp[i][j]=dp[i-1][j];
				}
	
			}
			
		}
		
		System.out.println(dp[n][tar]);
	
	}

}
