package arraysalgo;
import java.util.Scanner;

public class Hiwaybillboard {
	public static int solution(int m,int[]x,int []rev,int t) {
		
		int[]dp=new int[x.length];
		int ans=0;
		dp[0]=rev[0];
		
		for (int i=1;i<x.length;i++) {
			int max=0;
			for(int j=0;j<i;j++) {
				int dist=x[i]-x[j];
				if(dist>t) {
					max=Math.max(max, dp[j]);
				}
				
			}
			dp[i]=max+rev[i];
			ans=Math.max(ans, dp[i]);
		}
		return ans;
		
	}
	public static void input(int []arr,Scanner sc) {       // input taking                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		
		int x[]=new int[n];
		input(x,sc);
		int revenue[]=new int [n];
		input(revenue,sc);
		
		int t=sc.nextInt();
		System.out.println(solution(m,x,revenue,t));
		sc.close();
		
		
		
	
		
		
	}

}
