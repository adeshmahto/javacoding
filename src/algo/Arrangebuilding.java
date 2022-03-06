package algo;

import java.util.Scanner;

public class Arrangebuilding {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		long n=sc.nextInt();
		long ocb=1;
		long ocs=1;
		for(int i=2;i<=n;i++) {
			long ncb=ocs;
			long ncs=ocb+ocs;
			ocb=ncb;
			ocs=ncs;
			
		}
		long total=ocb+ocs;
		total=total*total;
		System.out.println(total);

	}

}
