package dsa;

public class Xoroperator {

	public static void main(String[] args) {
		int [] arr= {5,1,2,5,2,1,4,1,2,5};
		int res=0;
		int temp=0;
		for(int i=0;i<arr.length;i++) {
			
			res=res^arr[i];
			
		
		}
		temp=res;
		System.out.println(res);
//		int temp1=temp;
//		for(int i=0;i<arr.length;i++) {
//			if((arr[i]&1)!=0) {
//				temp=temp^arr[i];
//				
//			}
//		}
//		int a=temp;
//		
//		System.out.println(a);
//		int b=a^temp1;
//		System.out.println(b);
		
		

	}

}
