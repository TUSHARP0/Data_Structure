package DoublyLinkedList;

public class DLLTester {

	public static void main(String[] args) {
		DoublyLinkedList dll= new DoublyLinkedList();
		
		dll.insertByValue(10);
		dll.insertByValue(20);
		dll.insertByValue(30);
		dll.insertByValue(40);
		System.out.println("Display: ");
		dll.display();
		System.out.println();
		
		System.out.println("Insert By Position: ");
		dll.insertByPos(50, 5);
		dll.display();
		System.out.println();
		
//		System.out.println("Delete By Value: ");
//		dll.deleteByValue(50);
//		dll.display();
		
		System.out.println("Delete By Position");
		dll.deleteByPos(5 );
		dll.display();
		
	}
}
