package arraysalgo;

public class LuckyNumber {

	public static void main(String[] args) {

		
  System.out.println(Luck(1,2));
    	
    
    	
  
	}
	public static boolean Luck(int n, int count) {
		if(count>n) return true;
		if(n%count==0) return false;
		return Luck(n-n/count,count++);
	
	}

}
