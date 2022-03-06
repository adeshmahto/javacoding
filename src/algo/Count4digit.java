package algo;

public class Count4digit {

	public static void main(String[] args) {
	 
		int n=1579;
		int count=0;
		int m;
		for(int i=1;i<=n;i++) {
		    m=i%10;
			if(i==4) {
				count++;
			}else if(m==4) {
				count++;
			}else {
				m=m/10;
			}
			
		}
		System.out.println(count);

	}

}
