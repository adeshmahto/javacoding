package practice3;

class rectangle1{
int l;
int b;
	private int side;
	private int area;
	private int perimeter;
	private String name;
	
	public rectangle1() {
		side=34;
		
	}
	public rectangle1(int length, int breadth) {
		side=56;
	}
	public void setside(int n) {
		side=n;
	}
	
	public int getside() {
		return side;
		
	}
	public void setArea(int a) {
		area=a;
		}
	public Double getArea() {
	return 3.14*area;
	}
	public void setPerimeter(int a) {
		perimeter=a;
		}
	public Double getPerimeter() {
	return  2*3.14*perimeter;
	}
}

public class Practicemain {
	public static void main(String[] args) {

		rectangle1 harry =new rectangle1(4,9);
		System.out.println(harry.getside());

	
	}

}
