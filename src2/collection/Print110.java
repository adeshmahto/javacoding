package collection;

public class Print110 {

	public static void main(String[] args) {
	
prin(5);
	}
 public static void  prin(int n) {
	 if( n==0) {
		 return ;
	 }
	 int b= n-1;
                                       
	prin(b);
	System.out.println(n);

	
 }                                                            

}
