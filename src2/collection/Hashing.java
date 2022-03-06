package collection;

public class Hashing {

	public static void main(String[] args) {
		int res=0;
		int [] arr= {1,2,3,4,4,3};
		int [] hash= new int [100];
		for(int i=0;i<arr.length;i++) {
			if(hash[arr[i]]==0) {
				hash[arr[i]]++;
				res+=arr[i];
			}
		}
		System.out.println(res);
		

	}

}
