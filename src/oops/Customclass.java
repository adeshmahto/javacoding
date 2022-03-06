package oops;


class Square{
	int   side;
	int  area;
	int   perimeter;

	


	public int Area() {
		area=side*side;
		return area;
		

	}
	public int Perimeter() {
	 perimeter =4*side;
	 return perimeter;
	}
	
	

}


public class Customclass {

	public static void main(String[] args) {
	Square.a=new Square();
	System.out.println(a.Area());
		
	

	}

}
