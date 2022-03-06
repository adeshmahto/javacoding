package practice_in;
class Super{
	
	 Super(){
		 System.out.println("i am a base constructor"); 
	 }
	 Super(int x) {
		 System.out.println(" i am a base constructor with value of "+x); 
	 }
}
class Sub extends Super{
	Sub () {
		 System.out.println("i am a derived class");
	 }
	Sub(int x , int y) {
		super(x);
		System.out.println("i am a derived class with value of " + y);
	 }
}
class child extends Sub{
	child(){
		System.out.println("i am a child class");
	}
	child (int x,int y, int z){
		super(x,y);
	System.out.println("i am a child class with value of"+ z);
	}
}
public class Class_in {
	public static void main(String[] args) {
child c= new child(7,8,9);
	}
}
