package inpractice;
class monkey{
	void jump() {
		System.out.println("jumping");
	}
	void biting() {
		System.out.println("bitting..");
	}
}
interface BasicA{
	void eat() ;
	
	void sleep();
	
}
class Human extends monkey implements BasicA{
	void chimpejee() {
		System.out.println("family member of Human");
	}
	public void eat() {
		System.out.println("eating..");
	}
	public void sleep() {
		System.out.println("sleeping...");
	}
	
}

public class Interfaceprac {

	public static void main(String[] args) {
	monkey m = new Human(); // polymorphism
	m.jump();