package dsa;

public class Recursiontree {

	public static void main(String[] args) {
		
		System.out.println(palin("abch",0,3));

	}
	public static boolean palin(String s,int r, int l) {
		if (r>=l) return true;
		else if(s.charAt(r)!=s.charAt(l)) return false;
		 return palin(s,r+1,l-1);


	}

}
