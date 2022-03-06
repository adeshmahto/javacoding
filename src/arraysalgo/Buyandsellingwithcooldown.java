package arraysalgo;

import java.util.Scanner;

public class Buyandsellingwithcooldown {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []arr=new int [n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			
		}
		int obsp=-arr[0];
		int ossp=0;
		int ocssp=0;
		for(int i=1;i<arr.length;i++) {
			int nbsp;
			int nssp;
			int ncssp;
			if(ocssp-arr[i]>obsp) {
				nbsp=ocssp-arr[i];
			}else{
				nbsp=obsp;
			}
			if(obsp+arr[i]>ossp) {
				nssp=obsp+arr[i];
			}else {
				nssp=ossp;
			}
			if(ocssp>ossp) {
				ncssp=ocssp;
			}else {
				ncssp=ossp;
			}
			
			ossp=nssp;
			obsp=nbsp;
			ocssp=ncssp;
			
		}
		System.out.println(ocssp);
		

	}

}
