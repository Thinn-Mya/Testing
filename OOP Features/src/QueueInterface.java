package QueueTest;

public interface QueueInterface {
	
 public void enqueue(int data);
 public int dequeue();
 public int peek();
 public boolean isFull();
 public boolean isEmpty();
 public int size();
 
}
