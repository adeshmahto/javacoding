package inheritance;



class Base{
	 public int x;
	 public void setX(int x) {
		 System.out.println("i am in base and setting");
		 this.x=x;
	 }
	 public int getX() {
		 return x;
	 }}
 class Derived extends Base{
	   public int y;
	   
	       public void setY(int y) {
	
		    this.y=y;
	      }
	        public int getY() {
		       return y;
	        }

 }


public class Inheritance_1 {
	public static void main(String[] args) {
	
	Base b= new Base();
	b.setX(56);
	System.out.println(b.getX());
	Derived d= new Derived();
	d.setX(89);
	System.out.println(d.getX());
	    
		
		
	
	}

}
