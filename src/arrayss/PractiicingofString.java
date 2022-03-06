package arrayss;

public class PractiicingofString {

	public static void main(String[] args) {
	String [] name= {"adesh","aditi","ankita"};
	String st = null;
		
		int max=name[0].length();
		for(int i=0;i<name.length;i++) {
			if(name[i].length()>max) {
				st=name[i];
			}
			
		}
		System.out.println(st);
	   

	}

}
