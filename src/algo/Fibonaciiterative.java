package algo;

public class Fibonaciiterative {

	public static void main(String[] args) {
		for(int i=0;i<10;i++) {
			System.out.println(fibo(10)[i]);
		}
	
	}public static long[] fibo(int n) {
		long arr[]=new long [n+1];
		arr[0]=0;
		arr[1]=1;
		long n1=0,n2=1,n3;
		for(int i=2;i<n;++i) {
			n3=n1+n2;
			arr[i]=n3;
			n1=n2;
			n2=n3;
	
		}
		return arr;
		
	}

}
