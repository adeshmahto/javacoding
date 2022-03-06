package dsa;

public class Kedansalgorithm {

	public static void main(String[] args) {
	
		int [] arr= {10,-3,-4,7,6,5,-4,-1};
		System.out.println(Maxsubarr(arr));

	}
	
   public static int Maxsubarr(int []arr) {
	   int Max_sum=0;
	   int cursum=0;
	   for(int i=0;i<arr.length;i++) {
		   cursum+=arr[i];
		   if(cursum>Max_sum) {
			   Max_sum=cursum;
		   }
		   else if(cursum<0){
			   cursum=0;
		   }
		   
	   }  
	   return Max_sum;
   }

}
