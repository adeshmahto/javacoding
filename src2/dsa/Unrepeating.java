package dsa;

public class Unrepeating {

	public static void main(String[] args) {
	int [] arr = {2,2,3,3,8,7,4,4};
	int b=0,c;
	int res =0;
	for(int i=0;i<arr.length;i++) {
		res= res^arr[i];
		if((res & 1)==1) {
			if((arr[i] & 1)==1) {
				b=b^arr[i];
				c=b^res;
					
				
			}
		}
	
	}
	System.out.println(b);

	}

}
