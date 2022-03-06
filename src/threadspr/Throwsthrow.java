package threadspr;

class NegativeRadiusException extends Exception{
	  @Override
		public String toString(){
			return "";
		}
	  @Override                                        
	  public String getMessage() {
		  return "";
	  }
		
	}
	
public class Throwsthrow {
	public static double area(int r) throws NegativeRadiusException {
		if(r<0) {
			throw new NegativeRadiusException();
		}
		double ar= Math.PI*r*r;
		return ar;
	}
	
	
	public static int divide(int a, int b)throws ArithmeticException {
		int result = a/b;
		return result;
	}

	public static void main(String[] args) {

try { 
	double r=area(-1);
	
		System.out.println(r);
}
catch(Exception e) {
	System.out.println("Exception!");
}
		
		
	}

}
