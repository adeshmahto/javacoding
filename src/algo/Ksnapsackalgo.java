package algo;

import java.util.Scanner;

public class Ksnapsackalgo {

	public static void main(String[] args) {
		
		float weight[]=new float[20],temp;
		float profit[]=new float[20];
		float capacity;
		float ratio[]=new float[20];
		int num,i,j;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the no. of object:-");
		num=sc.nextInt();
		System.out.println("Enter the wts and prodfit of each object:-");
		
		for(i=0;i<num;i++) {
			weight[i]=sc.nextFloat();
			profit[i]=sc.nextFloat();
			
		}
		System.out.println("enter the capacity of knapsack:-");
		capacity=sc.nextFloat();
		
		// storing the ratios of profit per weight
		
		for(i=0;i<num;i++) {
			ratio[i]=profit[i]/weight[i];
		}
		
		// sorting -----> decreasing order of ratior
		
		for(i=0;i<num;i++) {               // bubble sort
			for(j=0;j<num-i-1;j++) {
				if(ratio[j]<ratio[j+1]) {
					// swapping the ratio
					temp=ratio[j];
					ratio[j]=ratio[j+1];
					ratio[j+1]=temp;
					// swapping the weight
					temp=weight[j];
					weight[j]=weight[j+1];
					weight[j+1]=temp;
					// swapping the profit
					temp=profit[j];
				    profit[j]=profit[j+1];
					profit[j+1]=temp;
					
				}
			}
		}
		knapsack(num,weight,profit,capacity);
		

	}
public static void knapsack(int n,float weight[], float profit[], float capacity) {
	
	float x[]=new float[20],tp=0;
	int i,j;
	float u=capacity;
	
	for(i=0;i<n;i++) {
		if(u>0 && weight[i]<=u) {
			u=u-weight[i];
			tp=tp+profit[i];
		}else {
			break;
		}
	}
if(u>0) {
	tp=tp+profit[i]*(u/weight[i]);

	}	System.out.println("maximum profit is:-"+tp);
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
