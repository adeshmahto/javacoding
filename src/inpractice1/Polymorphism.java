package inpractice1;
abstract class telephone{
	abstract public void ring();
	abstract public void lift();
	abstract public void disconnected();
}
 class Smartphone extends telephone{
	public void wifi() {
		System.out.println("internet!");
	}
	public void ring() {
		System.out.println("Ringing");
	}
	public void lift()
	{
		System.out.println("lifting");
	}
	public void disconnected() {
		System.out.println("disconnecting..");
	}


	}
 class Polymorphism {

	public static void main(String[] args) {
	telephone t = new Smartphone();
	
	t.disconnected();
	}

}
