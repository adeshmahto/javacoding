package dsa;

public class BalanceNo {

	public static void main(String[] args) {
		String s="1234006";
		
		System.out.println(bc(s));
	}
		
		static boolean bc(String s) {
		
		+
		
		int sum=0;
		int sum1=0;
		
		char[] c=s.toCharArray();
		for(int i=0;i<s.length()/2;i++) {
		sum+=(c[i]-'0');
		}
		System.out.println(sum);
		for(int j=s.length()/2+1;j<s.length();j++) {
			sum1+=(c[j]-'0');
		}
		System.out.println(sum1);
		if(sum==sum1) {
			return  true;
		}
		else {
			return false;
		}
		}

	}


