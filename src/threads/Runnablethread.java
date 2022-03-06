package threads;

class  myRunnable implements Runnable{
	public myRunnable (String string) {
		
		
	}
	
	public void run() {
		System.out.println("i am a runnable thread");
	}
	
}


public class Runnablethread {

	public static void main(String[] args) {
		myRunnable m= new myRunnable("4");
		Thread t= new  Thread(m);
		
		System.out.println(t.getId());
		System.out.println(t.getName());
		

	}

}
