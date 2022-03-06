package algo;

import java.util.Scanner;

public class Maxsum_NOn_adjacent {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		int arr[]=new int[n];
//		System.out.println("Enter the value:");
//		for(int i=0;i<n;i++) {
//			arr[i]=sc.nextInt();
//		}
//		int inc[]=new int[n];      // 1st method
//		int exc[]=new int [n];
//		inc[0]=arr[0];
//		exc[0]=0;
//		for(int i=1;i<arr.length;i++) {
//			 inc[i]=exc[i-1]+arr[i];
//			 exc[i]=Math.max(inc[i-1], exc[i-1]);
//		}
//		System.out.println(Math.max(inc[n-1], exc[n-1]));         // answer
		
		int n=sc.nextInt();
     	int arr[]=new int[n];
     	System.out.println("Enter the value:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int inc=arr[0];
		int exc=0;
		for(int i=1;i<arr.length;i++) {
			int ninc=exc+arr[i];
			int nexc=Math.max(exc, inc);
			
			inc=ninc;
			exc=nexc;
		}
		System.out.println(Math.max(inc, exc));
		
		
	}

}
