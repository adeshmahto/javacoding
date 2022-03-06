package dataalgo1;

public class TriangulaMatrix {

	public static void main(String[] args) {
	int [][] arr= {{1,2,3},
				  {6,7,8},
				  {4,5,6,}};
	int sum=0;
		
	for(int i=0;i<3;i++) {
		for(int j=0;j<3;j++) {
			if(i>j) {
				sum+=arr[i][j];
			}
		}
	}
	System.out.println(sum);
	}

}
