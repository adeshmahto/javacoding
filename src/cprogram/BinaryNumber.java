package cprogram;

import java.util.Scanner;

public class BinaryNumber {

	public static void main(String[] args) {
		
	int dec=0,sum=0,ld=0;
	System.out.println("enter the decimal no.");
	Scanner sc=new Scanner(System.in);
	int x=sc.nextInt();   
	int j=0;
	while(x!=0) {
		ld=x%10;           //1110  ->0,1,1
		dec=(int)Math.pow(2, j)*ld;
		sum+=dec;            //0,2,4,8=> 14
		x =x/10;           // 111,11
		j++;
	}System.out.println(sum);

	
    																//2^n---------------------2^3,2^2,2^1,2^0;  =>14
																						//		1, 1,  1,   0
		
	}

}
