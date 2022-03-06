package algo;

import java.util.Scanner;

public class Climbminstepstairs {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. of steps:");
		int n=sc.nextInt();
		System.out.println("Enter the variable jumps:");
		int arr[]=new int[n];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		Integer [] dp=new Integer[n+1];
		dp[n]=0;         // base condition
		
		for(int i=n-1;i>=0;i--) {
			if(arr[i]>0) {         // not equal to zero mean if counter 0 mean no way to go
				int min=Integer.MAX_VALUE;
				
				for(int j=1; j<=arr[i] && i+j <dp.length ;j++) {
					if(dp[i+j]!=null) {                // if any index has null means not to consider other wise take
						min=Math.min(min, dp[i+j]);
					}
				}
				if(min!=Integer.MAX_VALUE) {       
					dp[i]=min+1;
				}else {                               // suppose if all the way contain null then that index is also null
					dp[i]=null;
				}
				
			}
		}
		System.out.println("anwser->");
		System.out.println(dp[0]);

	}

}
