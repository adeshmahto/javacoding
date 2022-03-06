package deque;

public class Mydequeeimplement {

	public static void main(String[] args) {
		Mydeque<Integer> md=new Mydeque<>();
		md.addFirst(45);
		md.addFirst(56);
		System.out.println(md.removeLast());

	}

}
