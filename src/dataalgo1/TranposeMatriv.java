package dataalgo1;

public class TranposeMatriv {

	public static void main(String[] args) {
		int [][] arr= {{1,2,3},
				      {6,7,8},
				     {4,5,6,}};
	int temp=0;
		
	for(int i=0;i<3;i++) {
		for(int j=0;j<3;j++) {
			temp=arr[i][j];
			arr[i][j]=arr[j][i];
			arr[j][i]=temp;
		}
	}
	
	}


	}
}
}
