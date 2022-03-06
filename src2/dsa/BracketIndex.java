package dsa;

public class BracketIndex {

	public static void main(String[] args) {
		String s="[ABC[23]][89]";
		int pos=0;
		System.out.println(Bracket(s,pos));
		
	}
	public static int Bracket(String s,int pos) {
		int open=1;
		int index=0;
		for(int i=pos+1;i<s.length();i++) {
			 
			if(s.charAt(i)=='[') open++;
			else if(s.charAt(i)==']') {
				index=i;
				if(open==1)  break;
				else open--;
			}
			
		}
		return index;
		
	}
	
}

