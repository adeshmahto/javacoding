package dsa;

import java.util.Scanner;

public class LongestStringpalindrome {

	public static void main(String[] args) {
		String s=" ";
		System.out.println("enter the string:");
	Scanner sc=new Scanner(System.in);
	String str = sc.nextLine();
	int i=0,j=0;
	
	boolean [] [] dp= new boolean [str.length()] [str.length()];
	int len=0;
	for (int g=0;g<str.length();g++) {
		for( i=0, j=g;j<str.length();i++,j++) {          //g=gap;
			if (g==0) {                                      //(1,1)  , (0,0) etc           // it represent diagonal.
				dp[i][j]=true;
			}else if(g==1) {                                // (0,1),  (1,2) etc
				if(str.charAt(i)==str.charAt(j)) {
					dp[i][j]=true;
				}else {
					dp[i][j]=false;
				}
				
			}else {
				if(str.charAt(i)==str.charAt(j)&& dp[i+1][j-1]==true) {
					dp[i][j]=true;
				}else {
					dp[i][j]=false;
				}
				
			}
			
			if(dp[i][j]) {
				s=str.substring(i);
			
				len=g+1;
				
			}
			
		}
		
	}
	System.out.println(s);
	

	


	}

}
