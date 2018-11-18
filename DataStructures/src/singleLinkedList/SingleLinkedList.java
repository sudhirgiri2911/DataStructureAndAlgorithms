package singleLinkedList;

public class SingleLinkedList {

	public Node head;
	
	public SingleLinkedList() {
		this.head = null;
	}
	
	public SingleLinkedList(Node node) {
		this.head = node;
	}
	
	public boolean isEmpty() {
		return head==null;
	}
	
	public void insertAtEnd(int data) {
		if(isEmpty()) 
			head = new Node(data);
		else {
			Node temp = head;
			while(temp.next!=null)
				temp = temp.next;
			temp.next = new Node(data);
		}
	}
	
	public void insertAtStart(int data) {
			Node temp = new Node(data);
			temp.next = head;
			head = temp;
	}
	
	public int position(int data) {
		if(isEmpty()) return -1;
		Node temp = head;
		int count = 0;
		while(temp!=null) {
			count++;
			if(temp.data == data) return count;
			temp =temp.next;
		}
		return -1;
	}
	public void insertAtPosition(int position, int data) {
		if(position == 1) {
			insertAtStart(data);
			return;
		}
		Node temp =head;
		Node node = new Node(data);
		int count = 1;
		while((count < position - 1) && (temp!=null)) {
			temp = temp.next;
			count++;
		}
		if(temp!=null) {
			node.next = temp.next;
			temp.next = node;
		}
	}
	
	public int size() {
		int count = 0;
		Node temp = head;
		while(temp!=null) {
			count++;
			temp = temp.next;
		}
		return count;
	}
	
	public void reverse() {
		Node curr, prev, next;
		prev = null;
		curr = head;
		while(curr!=null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr= next;
		}
		head = prev;
	}
	
	public void sortByExchangingData() {
		Node start,temp,end = null;
		for(end = null ; end!=head.next; end = start) {
			for(start = head; start.next!=end ;  start = start.next) {
				temp = start.next;
				if(start.data > temp.data) {
				  int var = start.data;
				  start.data = temp.data;
				  temp.data = var;
				}
			}
		}
	}
	
	public void sortByExchangingLink() {
		Node start, temp ,end, aiseHi;
		for(end = null; end != head.next ; end = start) {
			for(aiseHi = start = head ; start.next != end ; aiseHi = start, start = start.next) {
				temp = start.next;
				if(start.data > temp.data ) {
					start.next = temp.next;
					temp.next = start;
					if(start!=head)
						aiseHi.next = temp;
					else
						head = temp;
					Node newNode = start;
					start = temp;
					temp = newNode;
				}
			}
		}
	}
	public void display() {
		Node temp = head;
		while(temp!=null) {
			System.out.println(temp.data + " ");
			temp = temp.next;
		}
}
	
	
	
}
