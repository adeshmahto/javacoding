package arrng;

public class GEtmissingnousingXor {

	public static void main(String[] args) {
		int [] arr= {1,2,3,5};
		int n=arr.length+1;
		int x1=1;
		int x2=arr[0];
		for(int i=1;i<arr.length;i++) {
			x2=x2^arr[i];
		}
		for(int i=2;i<=n;i++) {
			x1=x1^i;
		}
		System.out.println(x1^x2);

	}

}
