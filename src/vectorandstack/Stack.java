package vectorandstack;

public class Stack {

	public static void main(String[] args) throws Exception {
		Mystack <Integer> stack=new Mystack<>();
		
		int popping=stack.pop();
		System.out.println(popping);
		int peeking =stack.peek();
		System.out.println(peeking);
	
		
		

	}

}
