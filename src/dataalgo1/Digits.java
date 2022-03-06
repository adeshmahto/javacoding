package dataalgo1;

public class Digits {

	public static void main(String[] args) {
		
	int [] arr = {1,22,333,44,55,66};
		int j;
		int d=0;
		int sum=0;
		int temp;
		int val;
	
		for(int i=0;i<arr.length;i++) {
		 j=0;
		 temp=arr[i];
		 val=arr[i];
		 
			while(temp!=0) {
				
				temp=temp/10;
				j++;
			}
			arr[i]=val;
		
		if(j==2) {
			sum+=arr[i];
		}
		}
		System.out.println(sum);
		

	}

}
