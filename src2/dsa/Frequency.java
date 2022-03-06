package dsa;

public class Frequency {

	public static void main(String[] args) {
	int [] arr= {1,2,1,3,1,4,5,6};
	int sum=0;
	int sum1=0;
	int freq=0;
	int key=4;
	int flag=0;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]==key) {
			flag=1;
			
					
		}
		if(arr[i]<key) {
			
			sum+=arr[i];
			
		}else if (arr[i]>key) {
			sum1+=arr[i];
		}
		
		
	}
	if(flag==0) {
		System.out.println("key value not exits " + key);
	}else
		System.out.println("key value is exits " + key);
		System.out.println("the sum of less than key value:"+ sum);
		System.out.println( "the sum of greater than key value:"+sum1);
	

	}

}
