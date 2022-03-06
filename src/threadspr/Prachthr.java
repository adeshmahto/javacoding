package threadspr;

class mythrd extends Thread{
	public void run() {
		int i=0;
		while(i<30) {
	
		System.out.println(" welcome");	
		
//		try {
//			Thread.sleep(100);
//		}
//		catch(Exception e) {
//			System.out.println(e);
//		}
		i++;
}
	}	
}
class mythrd2 extends Thread{
	public void run() {
		
		System.out.println(" thank you");	
		
	
}
}
	





public class Prachthr {

	public static void main(String[] args) {
		mythrd m= new mythrd();
		
		
		mythrd2 n= new mythrd2();
		n.setPriority(6);
		m.setPriority(1);
		
System.out.println(m.getPriority());
System.out.println(n.getPriority());
System.out.println(n.getState());
n.start();
System.out.println(m.currentThread());


	
	

	}

}
