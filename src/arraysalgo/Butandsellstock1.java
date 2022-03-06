package arraysalgo;

import java.util.Scanner;

public class Butandsellstock1 {

	public static void main(String[] args) {
		
		System.out.println("enter the no. of day");
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Enter the prices:");
		
		int []prices= new int[n];
		for (int i=0;i<prices.length;i++) {
			prices[i]=sc.nextInt();
					
		}
		int lsf=Integer.MAX_VALUE;    // least so far
		int op=Integer.MIN_VALUE;		  // over profit or maximum profit
		int pist=0;            // profit if sold today
		
		for(int i=0;i<prices.length;i++) {
			if(prices[i]< lsf) {
				lsf=prices[i];
			}
			
			pist=prices[i]-lsf;
			if(pist>op) {
				op=pist;
			}                        
		}
		System.out.println("max profit -->");
		System.out.println(op);
		

	}

}
