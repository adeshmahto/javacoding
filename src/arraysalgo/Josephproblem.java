package arraysalgo;

public class Josephproblem {
	
public static void main(String[] args) {
	
	System.out.println(Jos(3,1));
		
}
public static int Jos(int n, int k) {
	if(n==1) return 1;
      return (Jos(n-1,k)+k-1)%n+1;
}
}
