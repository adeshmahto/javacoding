package stringint;

public class Convertstoi {

	public static void main(String[] args) {
	
         String s="adesh";
         int n=0;
         char[] c= s.toCharArray();
         for(int i=0;i<c.length;i++) {
        	 if(c[i]>='0'&& c[i]<='9') {
        		 n=n*10+(c[i]-'0');
        		 
        	 }
         }
         System.out.println(n);
	}

}
