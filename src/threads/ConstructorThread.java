package threads;

class Mythr1 extends Thread{
	
	public void run() {
		for(int i=1;i<5555;i++) {
			
		System.out.println("Thank you ");
		try {
			Thread.sleep(455);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
}
}
}
class Mythr2 extends Thread{

	public void run() {
		for(int i= 1;i<5555;i++) {
		System.out.println("My thankuh");
	}
}
}
public class ConstructorThread {

	public static void main(String[] args) {
	
	Mythr1 t1= new Mythr1();
	Mythr2 t2= new Mythr2();
	t1.start();
	t2.start();
		
		
		
	
		
		
	}

}
