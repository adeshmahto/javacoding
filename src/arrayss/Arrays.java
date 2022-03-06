package arrayss;

public class Arrays {

	public static void main(String[] args) {
		int [] arr = {1,2,3,4};
		int sum=0;
		int sum1=0;
		int mul=1;
	
		
		for(int i=0;i<arr.length/2;i++) {
			sum+=arr[i];
			}
		for(int j=arr.length/2;j<arr.length;j++) {
			sum1+=arr[j];
		
		}
		mul=sum*sum1;
		System.out.println(sum);
		System.out.println(sum1);
		System.out.println(mul);
		

	}

}
