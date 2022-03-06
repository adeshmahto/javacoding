package oops3;

class tommy{
	private int side;
	private int area;
	private int perimeter;
	private String name;
	
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
public class Cellphone{
	public static void main(String[] args) {
		tommy aman =new tommy();
aman.setside(5);
aman.setArea(5);
aman.setPerimeter(5);
System.out.println(aman.getside());
System.out.println(aman.getArea());
System.out.println(aman.getPerimeter());

	}

}
