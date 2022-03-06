package dsa;

public class Menudriven {

	public static void main(String[] args) {
		int [] arr= {1,2,3,4,5,6,7,8};
		
Menu(arr,1);
	}
	public static void Menu(int []arr ,int n) {
		int sum=0;
		int mean=0;
		int variance =0;
		int x=0;
		int y=0;
		int SD=0;
		int flag=0;
			switch(n) {
			case 1:
				for(int i=0;i<arr.length;i++) {
				sum+=arr[i];
				mean=sum/arr.length;
				}System.out.println(mean);
				
				break;
			case 2:
				for(int i=0;i<arr.length;i++) {
				x=(arr[i]-mean);
				y=(int )Math.pow(x, 2);
				variance+=y;
				SD=(int )Math.pow(variance, 0.5);}
				System.out.println(SD);
				break;
				
			case 3:
				for(int i=0;i<arr.length;i++) {
				x=(arr[i]-mean);
				y=(int )Math.pow(x, 2);
				variance+=y;
				}
				System.out.println(variance);
				break;
			case 4:
				System.out.println("this menu is exit now");
				break;
			}
		}
		
		
	}


