package dsa;

import java.util.Scanner;

public class Matrixsss {

	public static void main(String[] args) {          
	int [] [] arr=new int[3][3];
	int [] [] arr1=new int [3][3];
	
	int [] []sum= {{1,1,1},
			       {1,1,1},
			      {1,1,1}};
	
			
	
					
	for(int i=0;i<3;i++) {
		System.out.println("enter the elements for " +(i+1)+ " row :");
		for(int j=0;j<3;j++) {
			Scanner sc=new Scanner(System.in);
			 int x=sc.nextInt();
			arr[i][j]=x;
		}
	}
	for(int i=0;i<3;i++) {
		System.out.println("enter the elements for " +(i+1)+ " row :");
		for(int j=0;j<3;j++) {
			Scanner sc=new Scanner(System.in);
			 int x=sc.nextInt();
			arr1[i][j]=x;
		}
	}
	
	for(int i=0;i<3;i++) {
		
		for(int j=0;j<3;j++) {
			sum[i][j]*=arr[i][j]*arr1[i][j];
		}
	}
	
	for(int i=0;i<3;i++) {
		
		for(int j=0;j<3;j++) {
		System.out.println(sum[i][j]);
		}
	}
	
	}

}
