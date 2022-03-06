package dsa;



public class Dsakgo {
	
	static  int tc(int [] mul, int length) {
		int sum=0;
		int product=1;
		for(int i=0;i<length;i++) {
			sum=sum+mul[i];
		}
		for(int i=0;i<length;i++) {
			product*=mul[i];
		}
		
		
		return product ;
	
	}
	

	public static void main(String[] args) {
		
int [] arr = {2,3,4,5};

int c = tc(arr,1);
System.out.println(c);

	}

}
