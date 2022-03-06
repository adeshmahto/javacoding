package queue;

public class Myarrayqueue {
	
	int n=20;
	int [] q=new int [n];
	int front=0;
	int rear=0;
	
	
	public void enqueue(int item) {
		rear=(rear+1)%n;  // increment the rear by 1; so element will be added it next of index;
		
		if(front==rear) {
			System.out.println("q is full");
			if(rear==0) rear=n-1;
			else {
				rear=rear-1;
				return;
			}
			}
			else {
				q[rear]=item;
				return;
			}
			
		}
	int dequeue() {
		if(front==rear) {
			System.out.println("q is empty");
			return -1;
		}
		else {
			front=(front+1)%n;
			int item=q[front];
			return item;
		}
	}
		
	}
	


