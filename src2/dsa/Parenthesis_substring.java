package dsa;

public class Parenthesis_substring {

   public static void main(String[] args) {
	   
	   String s= "()(())(";
	   boolean [] [] dp= new boolean[s.length()][s.length()];
	   int len=0;
	   for(int g=0;g<s.length();g++) {
		   for(int i=0,j=g; j<s.length();j++,i++  ) {
			   if(g==0) {
				   dp[i][j]=false;
			   }else if(g==1) {
				   if(s.charAt(i)==s.charAt(j)) {
					   dp[i][j]=false;
				   }else {
					   dp[i][j]=true;
				   }
			   }
			   else {
				   if(s.charAt(i)==s.charAt(j) && dp[i+1][j-1]==false) {
					   dp[i][j]=false;
				   }else {
					   dp[i][j]=true;
					   
				   }
				   if(dp[i][j]) {
					  
				   }else {
					   len=g+1;
				   }
				   
			   }
		   }
		   
	   }
	   System.out.println(len);
	      
	   
	
}
         
	}


