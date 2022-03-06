package finallyvl;


  public class Finnalypr {

	public static int sum(int a,int b) {
		try {
			int c=a/b;
			return c; 
		}catch(Exception e) {
		
			System.out.println(e);
		}
		finally {
			System.out.println("this will print always");
		}
		return 0;
	}
	public static void main(String[] args) {

		int c= sum(6,4);
		System.out.println(c);
		
		
		
		
	}

}
