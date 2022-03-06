package mynewjava;

public class StringRecursion {

	public static void main(String[] args) {
		
boolean b= isPalin("abbad ",0,4);

System.out.println(b);
	}
	static boolean  isPalin(String s, int l,int r) {
		
		if(l>= r) {
			return true;}
		
		if((s.charAt(l)  !=s.charAt(r))) {
			return false;}
		
		return isPalin(s,l+1,r-1);
	}

}
