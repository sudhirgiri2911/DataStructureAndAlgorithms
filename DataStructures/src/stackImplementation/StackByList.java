package stackImplementation;

public class StackByList {

	private int [] array ;
	private int pointer;
	private int size;
	
	public StackByList(int size) {
		array = new int[size];
		pointer = -1;
		this.size = size;
	}
	
	private void push(int x) {
		if(!isFull()) {
			pointer+=1;
			array[pointer] = x;
		} else {
			System.out.println("Exception occured! Stack overflow cannot push " + x);
		}
	}
	
	private void pop() {
		if(!isEmpty()) {
			pointer--;
		}
		else {
			System.out.println("Stack Empty! Cannot pop");
		}
	}
	
	private int peek() {
		if(!isEmpty())
			return array[pointer];
		System.out.println("Empty Stack! Nothing to peek ");
		return -1;
	}
	
	public boolean isEmpty() {
		return pointer == -1;
	}
	
	public boolean isFull() {
		return pointer == size-1;
	}
	
	public void display() {
		if(isEmpty()) {
			System.out.println("Stack Empty!");
		}
		else {
			for(int iterator = pointer ; iterator >= 0 ; iterator--)
			{
				System.out.println(array[iterator]);
			}
		}
	}
	
	public static void main(String[] args) {
		StackByList stack = new StackByList(5);
		stack.pop();
		stack.peek();
		stack.push(1);
		stack.push(2);
		stack.display();
		stack.push(5);
		stack.push(7);
		stack.push(8);
		stack.push(11);
		stack.display();
	}
	
}
