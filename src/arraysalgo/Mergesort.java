package arraysalgo;

import java.util.Scanner;

public class Mergesort {

	public static void main(String[] args) {
		
	System.out.println("enter the elements:");	
	int [] arr=new int [20];
	
	 for(int i=0;i<5;i++) {
		 Scanner sc= new Scanner(System.in);
		 int x=sc.nextInt();
		 arr[i]=x;
	 }
	 
	 int []arr2= {2,3};
	
	
	for(int i=0;i<2;i++) {
		arr[5+i]=arr2[i];
		
	}
	for(int i=0;i<7;i++) {
		System.out.println(arr[i]);
		
	}
	
	

	}

}
