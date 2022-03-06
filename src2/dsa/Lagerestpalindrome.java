package dsa;

public class Lagerestpalindrome {

	public static void main(String[] args) {
	
		System.out.println(ispalin("adesh",0,3));
	}
	static boolean ispalin(String s,int l, int r) {
		if(l>=r) {
			return true;
		}
		if(s.charAt(l)!=s.charAt(r))   return false;
		return ispalin(s,l+1,r-1);
	}

}
