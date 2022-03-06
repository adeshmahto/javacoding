package dsa;

public class Deleteanelement {

	public static void main(String[] args) {
	int [] arr= {1,2,7,9,5};
	int position= 4;
	
	if(position>=arr.length+1) {
		System.out.println("deletion not possible\n");
	}
	else {
		
		for(int i=position -1 ;i<arr.length-1;i++) {
			
			arr[i]=arr[i+1];
			
		}
	}
	
	
	for(int i=0;i<arr.length-1;i++) {
		System.out.println(arr[i]);
	}

	}

}
