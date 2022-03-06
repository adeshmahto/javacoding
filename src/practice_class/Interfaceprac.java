package practice_class;



class monkey{
	void jump() {
		System.out.println("jumping..");
	}
	void bite() {
		System.out.println("biting...");
	}
interface BasicAnimal{
	  void eat();
	
	 void sleep() ;
		  
}
class Human extends monkey implements BasicAnimal{
	 public void meth7() {
		System.out.println("method7");
		
	}
	
	public void eat() {
		System.out.println("eating");
	}
		
	
	  public void sleep() {
		System.out.println("sleeping");
		
	}
	
	

}
}

public class Interfaceprac {

	public static void main(String[] args) {


Human hu = new monkey();
		
		
	 
			
		
	}
	}


