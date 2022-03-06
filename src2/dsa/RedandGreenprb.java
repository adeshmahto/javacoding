package dsa;

public class RedandGreenprb {

	public static void main(String[] args) {
		int count1=0;
		int count2=0;
		String name="GGGGGGR";
		char [] c=name.toCharArray();
		for(int i=0;i<=name.length()-1;i++) {
			if(c[i]=='G') {
				count1++;
			}else {
				count2++;
			}
			
		}
		if(count1<count2) {
			System.out.println(count1);
		}else {
			System.out.println(count2);
		}
		

	}

}
