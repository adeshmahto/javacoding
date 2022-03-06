package arraysalgo;

import java.util.Scanner;

public class Buyandsellktranction {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int []arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		int [][]dp=new int[k+1][n];
		
		for(int t=1;t<=k;t++) {
			for(int d=1;d<arr.length;d++) {
				int max=Integer.MAX_VALUE;
				
				for(int pd=0;pd<d;pd++) {
					int ptilltml=dp[t-1][pd];
					int ptth=arr[d]-arr[pd];
					
					if(ptilltml+ptth>max) {
						max=ptilltml+ptth;
					}
				}
				dp[t][d]=max;
			}
		}
		System.out.println(dp[k][n-1]);
		
	}

}
