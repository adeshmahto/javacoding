package constructor_overloading;


class Base2{
	Base2(){
		System.out.println("i am a base constructor!");
	}
	Base2(int x){
		System.out.println("i am a base constructor with value of a:" +x);
		
	}
}

class Derived2 extends Base2{
	Derived2(){
		//super(7);
		System.out.println(" i am a derived constructor");
	}
	Derived2(int x, int y){
		super(x);
		System.out.println("i am a derived constructor with value of y:" +y);
		
	}
}
class child extends Derived2{
	child(){
		System.out.println("i am a child constructor");
		
	}
	child(int x,int y,int z){
		super(x,y);
	
		System.out.println("i am a child constructor with value of z:" +z);
	}
}
public class Overloading_constructor {
	public static void main(String[] args) {
		//\Base2 c= new Base2();
		//Derived2 s= new Derived2(7,5);
		child c= new child(5,4,8);
	}

}
