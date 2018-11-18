package stackImplementation;

import singleLinkedList.SingleLinkedList;

public class StackByLinkedList {

	private int size;
	private int pointer;
	private SingleLinkedList linkedList ;
	
	public StackByLinkedList(int size) {
		this.size = size;
		linkedList = new SingleLinkedList();
		pointer = -1;
	}
	
	public void push(int x) {
		if(!isFull()) {
			linkedList.insertAtStart(x);
			pointer+=1;
		}
		else {
			System.out.println("Stack Overflow! Cannot push " + x);
		}
	}
	
	public int pop() {
		int x = -1;
		if(isEmpty()) {
			System.out.println("Stack Empty! Cannot pop");
			}
		else {
			x = linkedList.head.data;
			pointer-=1;
			linkedList.head = linkedList.head.next;
		}
		return x;
	}
	
	public int peek() {
		int x = -1;
		if(isEmpty()) {
			System.out.println("Stack Empty! Nothing to peek");
			}
		else {
			x = linkedList.head.data;
		}
		return x;
	}
	
	public int size() {
		return linkedList.size();
	}
	
	public void display() {
		linkedList.display();
	}
	
	public boolean isFull() {
		return pointer == size - 1 ;
	}
	
	public boolean isEmpty() {
		return linkedList.head==null;
	}
	
	public static void main(String[] args) {
		StackByLinkedList stack = new StackByLinkedList(5);
		stack.pop();
		stack.peek();
		stack.push(1);
		stack.push(2);
		stack.display();
		stack.push(5);
		stack.push(7);
		System.out.println(stack.isFull());
		stack.push(8);
		stack.push(11);
		stack.display();
	}
	
	
}
