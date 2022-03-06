package dsa;

import java.util.Arrays;

public class Casespecificstingsorting {

	public static void main(String[] args) {
		int i,a=0;
		String m=" ";
		String s="sbrDKi";
		char [] p=s.toCharArray();
		Arrays.sort(p);
		
		
		while(a!=p.length) {
			
			for(i=0;i<p.length;i++) {
				if(Character.isUpperCase(p[i]) && Character.isUpperCase(s.charAt(a)) && p[i]!=' ') {
					m=m+p[i];
					p[i]=' ';
					a++;
				}
				else if(Character.isLowerCase(p[i]) && Character.isLowerCase(s.charAt(a)) && p[i]!=' ') {
					m=m+p[i];
					p[i]=' ';
					a++;
				}
			}
		//	System.out.println(m);
			
		}
		System.out.println(m);


	}

}
