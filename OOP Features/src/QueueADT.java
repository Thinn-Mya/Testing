package QueueTest;

public class QueueADT implements QueueInterface {

	private int front;
	private int rear;
	private int size;
	private int[] queue;
	int count;
	
	public QueueADT(int size)
	{
		this.size = size;
		front = -1;
		rear = -1;
		queue= new int[this.size];
		count = 0;
	}
	@Override
	public void enqueue(int data) {
		if(isFull())
			System.out.println("queue is full");
		else
		{
			if(rear==size-1)
				rear=-1;
			
			rear++;
			queue[rear] = data;
			System.out.println("Enqueue data: " + queue[rear]);
			count++;//circular queue
			if(front==-1)
				front=0;
		}

	}

	@Override
	public int dequeue() {
		if(isEmpty())
		{
			System.out.println("Queue is empty!!");
			return 0;
		}
		else
		{
		//front++;
			int output = queue[front];
			
		System.out.println("Dequeue output "+ output);
		count--;
		if(front==size-1)
			front =-1;
		front++;
		return output;
		}
	}

	@Override
	public int peek() {
		
		return queue[front];
	}

	@Override
	public boolean isFull() {
		if(count==size)
		{
			return true;
		
		}
		else
			return false;
	}

	@Override
	public boolean isEmpty() {
	
		  if(count==0) return true; 
		  else return false;
		
		//return (front==-1 && rear ==-1);
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

	public static void main(String[] args) {
		
		QueueADT q1 = new QueueADT(3);
		q1.enqueue(150);
		
		q1.dequeue();
		//q1.dequeue();
		int i=100;
		//input
		while(!q1.isFull())
		{
			q1.enqueue(i++);
		}
System.out.println("peek()" +q1.peek());
//output
		while(!q1.isEmpty())
		{
			System.out.println(q1.dequeue());
		}
	}

}
