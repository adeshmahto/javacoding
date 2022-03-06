package amf;

class mythreadRunnable1 implements Runnable{
	public void run() {
		for(;;) {
		System.out.println("i am a thread 1");
	
	}
}}
class mythreadRunnable2 implements Runnable{
	public void run() {
		for(;;) {
		System.out.println("i am a thread 2");
	
	}
}
}




public class Accessmodf {

	public static void main(String[] args) {
		mythreadRunnable1 bullet1 =new mythreadRunnable1();
		Thread gun1=new Thread (bullet1);
		mythreadRunnable2 bullet2=new mythreadRunnable2();
		Thread gun2 = new Thread(bullet2);
		
	gun1.start();
	gun2.start();
		
	

	}

}
