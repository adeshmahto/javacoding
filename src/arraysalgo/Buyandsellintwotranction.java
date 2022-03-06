package arraysalgo;

import java.util.Scanner;

public class Buyandsellintwotranction {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int arr[]=new int[n];
		int []dpl=new int[arr.length];            // max profit if sold upto tody
		for(int i=0;i<arr.length;i++) {
			
			arr[i]=sc.nextInt();
		}
		int mpist=0;           // max profit if sold today         (left to right)
		int leastsf= arr[0];   // least so far
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<leastsf) {
				leastsf=arr[i];
			}
			mpist=arr[i]-leastsf;
			if(mpist>dpl[i-1]) {
				dpl[i]=dpl[i-1];
			}
		}
		
		int mpibt=0;         // max profit if boot tody             (right to left)
		int maxat=arr[arr.length-1];      // max after today
		int []dpr=new int [arr.length];
		for(int i=arr.length-2;i>=0;i--) {
			if(arr[i]>maxat) {
				maxat=arr[i];
			}
			mpibt=maxat -arr[i];
			if(mpibt>dpr[i+1]) {
				dpr[i]=mpibt;
			}else {
				dpr[i]=dpr[i-1];
			}
		}
		int op=0;
		for(int i=0;i<arr.length;i++) {
			if(dpl[i]+dpr[i]>op) {
				op=dpl[i]+dpr[i];
			}
		}
		System.out.println("answer->");
		System.out.println(op);
		
		
	}

}
