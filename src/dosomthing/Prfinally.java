package dosomthing;

public class Prfinally {
	
	public static int greet() {
		try {
			int a=5;
			int b=0;
			int c=a/b;
			return c; 
		}catch(Exception e) {
		
			System.out.println(e);
		}
		finally {
			System.out.println("this will print always");
		}
		return -1;
	}

public static void main(String[] args) {
		
int k= greet();
System.out.println(k); 

	}

}
