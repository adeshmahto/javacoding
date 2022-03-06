package dsa;

public class Recursiontree1 {

	public static void main(String[] args) {
  
		boolean s=fun("abac",0,3);
		if(s) System.out.println("It is a palindrome");
		
		else System.out.println("It is not palindrome");
	

	}public static boolean fun(String s, int r,int l) {
		
		if(r>=l) return true;   //base condition
		
		if(s.charAt(r)!=s.charAt(l)) return false;
		
		return fun(s,r+1,l-1);
	
		

	}
		

}
