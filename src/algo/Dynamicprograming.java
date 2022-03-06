package algo;

import java.util.Scanner;

public class Dynamicprograming {

	public static void main(String[] args) {
		
		System.out.println("Enter the number:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();

		System.out.println(fibomemorized(n, new int[n+1]));

	}
	

	
	public static int fibomemorized(int n,int qb[]) {            
		if(n==0 || n==1)
			return n;
		if(qb[n]!=0) {
			return qb[n];
		}
		System.out.println("hello"+n);                    // checker for duplicacy
		int fib1=fibomemorized(n-1, qb);
		int fib2=fibomemorized(n-2,qb);
		int fibn=fib1+fib2;
		qb[n]=fibn;
		return fibn;
		

	}
	
	

}
