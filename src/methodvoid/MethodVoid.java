package methodvoid;

public class MethodVoid {

static int  sum(int ...arr) {
  int result=0;
  for(int a:arr) {
	result +=a;
  }
return result;	
}

 public static void main(String[] args) {

	 int c=sum(5,6);
System.out.println(c); 
}

}
