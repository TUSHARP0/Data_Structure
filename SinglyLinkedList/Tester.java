package SinglyLinkedList;

public class Tester {

	public static void main(String[] args) {
		LinkedList ll= new LinkedList();
		ll.insertByValue(10);
		ll.insertByValue(20);
		ll.insertByValue(30);
		ll.insertByValue(40);
		
		System.out.println("Display Linked List: ");
		ll.display();
		
		System.out.println("Display Linked List Using Recursion: ");
		ll.displayRecur(ll.getHead());
		System.out.println();
		
		System.out.println("Display Reverse Linked List: ");
		ll.displayRev();
		System.out.println();
		
		System.out.println("Display Reverse Linked List Using Recursion:");
		ll.displayRevRecur(ll.getHead());
		System.out.println();
		
		System.out.println("Insert By Position: ");
		ll.insertByPosition(50, 5);
		ll.display();
		System.out.println();
		
		System.out.println("Delete By Value: ");
		ll.deleteByValue(50);
		ll.display();
		System.out.println();
		
		System.out.println("Delete By Position: ");
		ll.deleteByPos(4);
		ll.display();
		System.out.println();
		
//		System.out.println("Reverse");
//		 ll.reverse();
//		 ll.display();
//		 System.out.println();
		 
		 System.out.println("Reverse By Recursion:");
		 ll.reverseRecur(ll.getHead(), ll.getHead().getNext());
		 ll.display();
		
	}

}
