package DoublyLinkedList;

public class DoublyLinkedList {
	private Node head;
	
	public DoublyLinkedList() {
		head=null;
	}

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}
	
	public boolean insertByValue(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			return true;
		}
		Node last=head;
		while(last.getNext() != null) {
			last=last.getNext();
			if(last == null) {
				return false;
			}
		}
		last.setNext(newNode);
		newNode.setPrev(last);
		return true;
		}
	
	public void display() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.getData()+" ");
			temp=temp.getNext();
		}
		System.out.println();
	}
	
	public boolean insertByPos(int data, int position) {
		if(position <= 0 || (head == null && position > 1)) {
			return false;
		}
		Node newNode= new Node(data);
		if(position == 1) {
			if(head != null) {
			newNode.setNext(head);
			head.setPrev(newNode);
			}
			head=newNode;
			return true;
		}
		Node prev= head;
		for(int i =1; i< position - 1; i++) {
			prev=prev.getNext();
			if(prev == null) {
				return false;
			}
		}
		Node next= prev.getNext();
		newNode.setPrev(prev);
		prev.setNext(newNode);
		if(next != null) {
			newNode.setNext(next);
			next.setPrev(newNode);
		}
		return true;
	}
	
	public boolean deleteByValue(int data) {
		if(head == null) {
			return false;
		}
		if(head.getData() == data) {
			head=head.getNext();
			if(head != null) {
				head.setPrev(null);
			}
			return true;
		}
		
		Node del=head;
		while(del.getData() != data) {
			del=del.getNext();
			if(del == null) {
				return false;
			}
		}
		Node prev= del.getPrev();
		Node next= del.getNext();
		prev.setNext(next);
		if(next != null) {
			next.setPrev(prev);
		}
		
		return true;
	}
	
	public boolean deleteByPos(int position) {
		if(position <= 0 || head == null) {
			return false;
		}
		if(position == 1) {
			head=head.getNext();
			if(head != null) {
				head.setPrev(null);
			}
			return true;
		}
		
		Node del=head;
		for(int i=1;i<position;i++) {
			del=del.getNext();
			if(del == null) {
				return false;
			}
		}
		Node prev=del.getPrev();
		Node next= del.getNext();
		prev.setNext(next);
		if(next != null) {
			next.setPrev(prev);
		}
		return true;
	}
}
