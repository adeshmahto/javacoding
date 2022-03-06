package myjava;
import java.util.Scanner;
import java.util.Random;
class cylinder{                                  //quess no.using OOPs
	int quess;
	int nquess=1;
	public void cy(){

		Random rand=new Random();
				int number= rand.nextInt(100);
		do {
			System.out.println("quess the number:");
	        Scanner sc=new Scanner(System.in);
	           quess =sc.nextInt();
	          if (quess<number) {
	        	  System.out.println("higher number please!");  
	          }else if(quess >number) {
	        	  System.out.println("lower number please!");
	        	  
	          }else {
	        	  System.out.println("you guessed it !"+nquess+ " times");}
	          nquess++;
	       	         
		}while(quess!=number);
		
	}	
}
public class Newprogram {

	public static void main(String[] args) {
		random adesh= new random();
   
		adesh.randomNo();		
		}
	}




