package recursionpower;

public class PowerSetRec {

	public static void main(String[] args) {
	
       powerset("ab",0," ");
	}
	public static void powerset(String s,int i,String cur) {
		if(i==s.length()) {
			System.out.print(cur);
			return;
		}
		powerset(s,i+1,cur+s.charAt(i));
		powerset(s,i+1,cur);
		
		
		
		
			
	}

}
