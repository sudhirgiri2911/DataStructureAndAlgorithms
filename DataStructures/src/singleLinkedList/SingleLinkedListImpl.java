package singleLinkedList;

public class SingleLinkedListImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleLinkedList ll = new SingleLinkedList();
		ll.reverse();
		ll.insertAtStart(1);
		ll.insertAtStart(5);
		ll.insertAtStart(2);
		ll.insertAtStart(0);
		ll.insertAtPosition(3, 10);
		ll.display();
		ll.sortByExchangingData();
		ll.display();
		ll.reverse();
		ll.sortByExchangingLink();
		
		System.out.println("----------------------");
		ll.display();
		System.out.println("The position of the given data in linkedlist is " + ll.position(2));
		System.out.println(ll.size());
	}

}
