package threadspr;

import java.util.Scanner;

class myException extends Exception{
  @Override
	public String toString(){
		return "i am toString()";
	}
  @Override
  public String getMessage() {
	  return "i am getMessage()";
  }
	
}
public class Exceptionthr {

	public static void main(String[] args) {
		System.out.println("enter the number:");
	Scanner sc= new Scanner(System.in);
		int a=  sc.nextInt();
		if (a<56) {
			try {
				throw new myException();
			}catch(Exception e) {				
				System.out.println(e.getMessage());		
				System.out.println(e.toString());		
						
				e.printStackTrace();
			
			}
			
				
		
		}	
		



	}

}
