package queue;

public class QueueByList {
 
	private int rear ;
	private int front ;
	private int size;
	private int[] array;
	
	public QueueByList(int size) {
		array = new int[size];
		this.size = size;
		front = rear = -1;
	}
	
	public boolean isEmpty() {
		return (front == -1 || front == rear + 1);
	}
	
	public boolean isFull() {
		return rear==size-1;
	}
	
	public int size() {
		return rear+1;
	}
	
	public void enqueue(int x) {
		if(isFull()) {
			System.out.println("Queue Full! Cannot push " + x);
		}
		else {
			rear+=1;
			array[rear]  = x;
			System.out.println("Enqueued " + x);
			if(front == -1) front = 0;
		}
		
	}
	
	public void dequeue() {
		if(isEmpty()) {
			System.out.println("Cannot de-queue as queue is empty. Try adding some element and then dequeue.");
		}
		else {
			System.out.println("Dequed element " + array[front]);
			front+=1;
			
		}
	}
	
	public int peek() {
		if(isEmpty()) {
			System.out.println("Nothing to peek as queue is empty. Try adding some element and then peek.");
			return -1;
		}
		else {
			return array[rear];
		}
	}
	
	public void display() {
		System.out.println("The queue elements are:-");
		for(int i=front; i <= rear ; i++)
			System.out.println(array[i]);
	}
	
	public static void main(String [] args) {
		QueueByList queue = new QueueByList(5);
		queue.peek();
		queue.enqueue(50);
		queue.enqueue(40);
		queue.display();
		queue.dequeue();
		queue.display();
	}
}
