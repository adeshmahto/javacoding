package threadspr;

import java.util.Scanner;

public class Trycatch2 {

	public static void main(String[] args) {
	int [] arr= new int [3];
	arr[0] =2;
	arr[1]=34;
	arr[2]=64;
	System.out.println("enter the index number:");
	Scanner sc=new Scanner(System.in);
	int a = sc.nextInt();
	System.out.println("enter the number which is you want to divide:");
	Scanner x= new Scanner(System.in);
	int b=sc.nextInt();
	
	
	try {
		System.out.println("the index number is: "+arr[a]);
		System.out.println("the result after dividing the number"+ arr[a]/b);
		
	}catch (ArithmeticException e) {
		System.out.println("the reason is " +e);
	}catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("the reason is :" +e);
	}catch(Exception e) {
		System.out.println("the other reason to occured:");
	}
	
		

	}
	}
