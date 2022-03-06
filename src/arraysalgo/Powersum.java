package arraysalgo;

public class Powersum {

	public static void main(String[] args) {
	
System.out.println(pwersum(4,2));
	}
	public static int pwersum(int x, int n) {
		int upto=(int )(Math.pow(x,1/n))+1;
		int [] arr= new int [x+1];
		arr[0]=1;
		for(int i=1;i<=upto;++i) {
			int pow=(int ) Math.pow(i, n);
			for(int j=x;j>=pow;j++) {
				arr[j]+=arr[j-pow];
			}
		}
		return arr[x];
	}

}
