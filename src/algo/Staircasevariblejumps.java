package algo;

import java.util.Scanner;

public class Staircasevariblejumps {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of staircase:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the varible for staircase:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int dp[]=new int[n+1];
		dp[n]=1;      // base case n to n is 1;
		
		for(int i=n-1;i>=0;i--) {
			for(int j=1;j<=arr[i] && i+j<dp.length;j++) {             // jitna variable array mai store rahega wotna loop execute hoga
				dp[i]+=dp[i+j];
			}
		}
		
		System.out.println("answer->");
		
		System.out.println(dp[0]);
	
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             
	}

}
