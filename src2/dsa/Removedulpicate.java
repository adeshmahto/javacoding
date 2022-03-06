package dsa;

public class Removedulpicate {

	public static void main(String[] args) {
		String S="gfg";
		int[] dict = new int[123];
		String str = ""; 
		for(int i = 0; i < S.length(); i++) {
		char C = S.charAt(i);
		if(dict[C] == 0) {
		dict[C ]++;
		str += String.valueOf(C);
		}
		}
	System.out.println(str);

	}

}
