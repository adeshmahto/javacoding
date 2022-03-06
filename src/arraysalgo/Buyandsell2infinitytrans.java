package arraysalgo;

import java.util.Scanner;

public class Buyandsell2infinitytrans {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int []arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		int bd=0;       // buying day
		int sd=0;		// selling day
		int profit=0;
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>=arr[i-1]) {
				sd++;
			}else {
				profit=arr[sd]-arr[bd];
				bd=sd=i;
			}
			 profit=arr[sd]-arr[bd];
		}
		System.out.println(profit);
	}

}
