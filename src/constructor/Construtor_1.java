package constructor;
class Employee2{
	private int id;
	private String name;
	
	public Employee2( String myname) {
			
			name=myname;
	}public Employee2( int myid){
		    id =myid;
	}
		
		public int getId() {
			return id;
		}
		public void setId( int n) {
			id=n;
		}
		public String getName() {
			return name;
		}
		public void setName( String a) {
			name=a;
			
		}	
}

public class Construtor_1 {
	public static void main(String[] args) {
	
Employee2 harry = new Employee2("adesh is best coder");



System.out.println(harry.getId());

System.out.println(harry.getName());
	}

}
