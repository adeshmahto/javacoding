package dsa;

public class DulpicatString {

	public static void main(String[] args) {
		int x=0;
		
	String name="qiwekiiroc";
	int flag=0;
//	System.out.println(name.indexOf("V"));
	char [] c=name.toCharArray();
	for(int i=0;i<c.length;i++) {
		for(int j=i+1;j<c.length;j++) {
			if(c[i]==c[j] ) {
					x=name.lastIndexOf(c[i]);
					flag=1;

			}
		
		}
	
	}
	//System.out.println(x);
	for(int i=x;i<c.length-1;i++) {
		c[i]=c[i+1];
	}
	String s="";

for(int j=0;j<c.length-1;j++) {
	s=s+String.valueOf(c[j]);
}
if(flag==0) {
	System.out.println(name);
}else
System.out.println(s);

	}

}
