package collection;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class Anynomous {

	public static void main(String[] args) {
		
	     Scanner sc=new Scanner(System.in);
         System.out.println("================================");
         for(int i=0;i<3;i++){
             String s1=sc.next();
             int x=sc.nextInt();
             if(x<100){
                 System.out.println("0"+x);
                 
             }else{
                 System.out.println(x);
             }
                 
             
             
             
         }
         System.out.println("================================");
         
	}
}
