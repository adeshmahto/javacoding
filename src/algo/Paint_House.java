package algo;

import java.util.Scanner;

public class Paint_House {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. of house:");
		int n=sc.nextInt();
		int red[]=new int[n];
		int blue[]=new int[n];
		int green[]=new int[n];
		System.out.println("Enter the colour:");
		for(int i=0;i<n;i++) {
			red[i]=sc.nextInt();
			blue[i]=sc.nextInt();
			green[i]=sc.nextInt();
		}
		int ored=red[0];
		int oblue=blue[0];
		int ogreen=green[0];
		
		for(int i=1;i<n;i++) {
			
			int nred=Math.min(ogreen, oblue)+red[i];
			int nblue=Math.min(ogreen, ored)+red[i];
			int ngreen=Math.min(ored, oblue)+red[i];
			
			 ored=nred;
			 oblue=nblue;
			 ogreen=ngreen;
			
			
		}
		int min=Math.min(ogreen, oblue);
		int result=Math.min(min, ored);
		System.out.println("answer->");
		System.out.println(result);
		

	}

}
