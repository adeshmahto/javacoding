package vectorandstack;

import queue.Myqueue;

public class Mainclass {

	

	public static void main(String[] args) {
//	Stack<Integer> stack =new Stack<>();
//	stack.push(12);
//	stack.push(32);
//	stack.push(52);
//    System.out.println(stack.empty());
	
		Myqueue<Integer> mq=new Myqueue<>();
		mq.enqueue(12);
		mq.enqueue(16);
		mq.enqueue(19);
		System.out.println(mq.dequeue());
		System.out.println(mq.dequeue());
	
	

	}

}
