package dsa;

public class Iscommon {

	public static void main(String[] args) {
		int [] arr= {1,2,3,4,4,5,6,7};
		int [] arr2= {6,8,9,0,0,0};
		
		int c=isCommon(arr,arr2);
		if(c==1) {
			System.out.println("they have common element");
		}
		else {
			System.out.println("they dont have common element");
		}
		
	}
	public static int isCommon(int []arr ,int []arr2) {
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr2.length;i++) {
				if(arr[i]==arr2[j]) {
					return 1;
				}
			}
			
		}
		return 0;
		
		
	}
}
