package mynewjava;

public class Powerset {

	public static void main(String[] args) {
		
		powerSet("abc",0,"");
	

	}
	static void powerSet(String s, int i, String cur) {
		try {
		if(i== s.length())
			System.out.println(cur);
		}catch(Exception e) {
			System.out.println(e);
		}

		
		powerSet(s,i+1,cur+s.charAt(i));
		powerSet(s,i+i,cur);
		
		
	}

}
