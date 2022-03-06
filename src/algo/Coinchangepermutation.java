package algo;

import java.util.Scanner;

public class Coinchangepermutation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. of coin use:");
		int n=sc.nextInt();
		
		System.out.println("enter the coins:");
		int arr[]=new int[n];
		
		for(int i=0;i<arr.length;i++ ) {
			arr[i]=sc.nextInt();
		}
		System.out.println("enter the amount:");
		int amt=sc.nextInt();
		int dp[]=new int[amt+1];
		
		dp[0]=1;   // base case
		
		for(int i=1;i<dp.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(i-arr[j]>=0) {
					dp[i]+=dp[i-arr[j]];
				}
				
			}
		}
		System.out.println("Answer->");
		System.out.println(dp[amt]);
				
		
		

	}

}
