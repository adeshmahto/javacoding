package algo;

public class Testcase {

	public static void main(String[] args) {
		
		System.out.print(fibo(10)[0]);
	}
	public static long[] fibo(int n) {
		
        long arr[]=new long [1];
        arr[0]=fibomemorized(n, new int[n+1]);
        return arr;
	}
	public static int fibomemorized(int n,int qb[]) {            
		if(n==0 || n==1)
			return n;
		if(qb[n]!=0) {
			return qb[n];
		}
		//System.out.println("hello"+n);                    // checker for duplicacy
		int fib1=fibomemorized(n-1, qb);
		int fib2=fibomemorized(n-2,qb);
		int fibn=fib1+fib2;
		qb[n]=fibn;
		return fibn;
		

	}

}
