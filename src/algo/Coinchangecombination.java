package algo;

import java.util.Scanner;

public class Coinchangecombination {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of coin:");
		int n=sc.nextInt();
		
		int []arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt(); 
		}
		System.out.println("amount which have to find combinatio");
		int amt=sc.nextInt();
		int []dp=new int[amt+1];
		
		dp[0]=1; // base case!
		
		for(int i=0;i<arr.length;i++) {
			for(int j=arr[i];j<dp.length;j++) {
				dp[j]+=dp[j-arr[i]];
			}
		}
		System.out.println("this is combinations->");
		System.out.println(dp[amt]);
		

	}

}
