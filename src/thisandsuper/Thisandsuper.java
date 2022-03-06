package thisandsuper;
class phone{
	
		
	public void on() {
		System.out.println("phone is turning on...:");
	}
	
 }
class smartphone extends phone{
	public void on() {
	
		System.out.println("smartphone is turning on...");

 }
}

public class Thisandsuper {

	public static void main(String[] args) {
  phone obj = new smartphone();
  obj.on();
	
	}
}
