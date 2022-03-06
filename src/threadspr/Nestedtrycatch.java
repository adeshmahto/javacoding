package threadspr;

import java.util.Scanner;

public class Nestedtrycatch {

	public static void main(String[] args) {
		int [] marks= new int [3];
		marks[0]= 45;
		marks[1]= 65;
		marks[2]= 490;
	
		boolean  flag =true;
		while(flag) {
		System.out.println("enter the index number:");
		System.out.println("enter the number");
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		try {
			
			System.out.println("the number which you entered:"+marks[a]);
			try {
				System.out.println("the try level 2:"+marks[a]/b);
				flag= false;					                 //exit the loop ;							
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("the exception of inner try catch"+e);
				
			}
		}catch(Exception e) {
			System.out.println("the other exception come!");
		}
		
		

	}
	}
}
