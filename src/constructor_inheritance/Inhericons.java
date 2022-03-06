package constructor_inheritance;S
class parent{
	parent(){
		System.out.println("i am a constructor");
	}
	parent(int x,int y){
		
	
		System.out.println(" i am  a constructor with value " + x);
		
	}
}
class child extends parent{
	child(){
	
		System.out.println("i am a child constructor");
		
}
	child(int x, int y){
		super(x,y);
	
		System.out.println("i am a child constructor with value of y " + y);
		
}
}
class grand_child extends child{
	grand_child(){
		System.out.println("i am a constructor of grand child" );
	}
	grand_child(int x,int y,int z){
		super(y,z);
		System.out.println("i am a constructor of grand child value z:" +z );
	}
}



public class Inhericons {

	public static void main(String[] args) {
	//child c=new child(4,5);
	grand_child r=new grand_child(3,5,8);


	}

}
