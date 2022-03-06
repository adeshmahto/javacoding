package oops3;

class Rectangle {
	int side1;
	int side2;

	public int Area() {
		return side1*side2;
	}
	public int Perimeter() {
		 
		return 2*(side1+side2);
		
	}
}

public class Practice2 {


	public static void main(String[] args) {
   Rectangle harry= new Rectangle();
harry.side1=5;
harry.side2=6;
 System.out.println( harry.Area());
   System.out.println( harry.Perimeter());
	}

}
