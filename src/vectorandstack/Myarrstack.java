package vectorandstack;

public class Myarrstack {
	int max=20;
	int [] stack=new int [max];
	int top=-1;
	void push(int item) {
		if(top==max-1)  System.out.println("overflow");
		else {
			//top=top+1;
			stack[++top]=item;
			return;
		}
	}
	int pop() {
		int temp;
	     if(top==-1) {
	    	 System.out.println("underflow");
	    	 return -1;
	     }
	     else {
	    	 temp=stack[top--];
	    	// top=-top;
	     }
	     return temp;
	}

}
