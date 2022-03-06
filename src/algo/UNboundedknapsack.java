package algo;

import java.util.Arrays;
import java.util.Scanner;

public class UNboundedknapsack {

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
		int cap=sc.nextInt();
		int dp[]=new int [cap+1];
		dp[0]=0;
	
		
		for(int bagc=1;bagc<=cap;bagc++) {
			int max=0;
			for(int i=0;i<n;i++) {
				
				
				if(weight[i]<=bagc) {
					int rbagc=bagc-weight[i];
					int rbagv=dp[rbagc];
					int tbagv=rbagv+value[i];
					
					if(tbagv>max) {
						max=tbagv;
					}
				}
			}
			dp[bagc]=max;
		
			
		}
		System.out.println(dp[cap]);
		
	}

}
