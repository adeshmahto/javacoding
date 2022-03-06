package algo;

import java.util.Scanner;

public class Paint_fence {

	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number of fence and colour:");
	int n=sc.nextInt();
	int k=sc.nextInt();
	
	int oii=k;
	int ojj=2*k;
	
	for(int i=2;i<n;i++) {
		int noii=ojj;
		int nojj=2*(oii+ojj);
		
		oii=noii;
		ojj=nojj;
		
	}
	System.out.println("result--->");
	System.out.println(oii+ojj);

	}

}
