package usingxor;

public class Missingno {

	public static void main(String[] args) {
		int []arr= {1,2,3,4,5,6,7,9,10};
		System.out.println(fun(arr));
		

	}
	public static int  fun(int [] arr) {
		int x1=arr[0];
		int x2=1;
		for(int i=1;i<arr.length;i++) {
			x1=x1^arr[i];
		}
		for(int j=2;j<arr.length+2;j++) {
			x2=x2^j;
		}
		return x1^x2;
	}
	

}
