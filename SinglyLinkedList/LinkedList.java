package SinglyLinkedList;

import java.util.Stack;

public class LinkedList {
	private Node head;
	
	public LinkedList() {
		head=null;
	}

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}
	
	public boolean insertByValue(int data) {
		Node newNode=new Node(data);
		if(head==null) {
			head=newNode;
			return true;
		}
		Node last=head;
		while(last.getNext()!=null) {
			last=last.getNext();
		}
		last.setNext(newNode);
		return true;
	}
	
	public void display() {
		Node temp=head;
		if(temp == null) {
			return;
		}
		while(temp!=null) {
		System.out.print(temp.getData()+" ");
		temp=temp.getNext();
		}
		System.out.println();
	}
	
	public void displayRecur(Node head) {
		if(head == null) {
			return;
		}
		System.out.print(head.getData()+" ");
		displayRecur(head.getNext());
	}
	
	public void displayRev() {
		Node temp=head;
		Stack<Node> stack=new Stack<>();
		if(temp == null) {
			return;
		}
		while(temp != null) {
			stack.push(temp);
			temp=temp.getNext();
		}
		
		while(!stack.isEmpty()) {
			System.out.print(stack.pop().getData()+" ");
		}
		System.out.println();
	}
	
	public void displayRevRecur(Node head) {
		if(head == null) {
			return;
		}
		displayRevRecur(head.getNext());
		System.out.print(head.getData()+" ");
	}
	
	public boolean insertByPosition(int data,int position) {
		Node newNode= new Node(data);
		if( position <= 0 || (head==null && position > 1)) {
			return false;
		}
			if(position == 1) {
				newNode.setNext(head);
				head=newNode;
				return true;
			}
			Node prev=head;
			for(int i=1;i<position-1;i++) {
				prev=prev.getNext();
				if(prev == null) {
					return false;
				}
			}
			newNode.setNext(prev.getNext());
			prev.setNext(newNode);
			return true;	
		}
	
	public boolean deleteByValue(int data) {
		if(head == null) {
			return false;
		}
		
		if(head.getData() == data) {
			head=head.getNext();
			return true;
		}
		
		Node prev=head,del=head;
		while(del.getData() != data) {
			prev=del;
			del=del.getNext();
			if(del == null) {
				return false;
			}
		}
		prev.setNext(del.getNext());
		return true;
	}
	
	public boolean deleteByPos(int position) {
		if(head == null || position <= 0) {
			return false;
		}
		
		if(position == 1) {
			head=head.getNext();
			return true;
		}
		Node prev=head;
		for(int i=1;i<position-1;i++) {
			prev=prev.getNext();
			if(prev.getNext() == null) {
				return false;
			}
		}
		Node del=prev.getNext();
		prev.setNext(del.getNext());
		
		return true;
	}
	
	public void reverse() {
		if(head == null || head.getNext() == null) {
			return;
		}
		
		Node n1=head,n2=head.getNext();
		Node n3=null;
		while(n2!=null) {
			n3=n2.getNext();
			n2.setNext(n1);
			n1=n2;
			n2=n3;
		}
		head.setNext(null);
		head=n1;
	}
	
	public void reverseRecur(Node n1,Node n2) {
		if(n2 == null) {
			head.setNext(null);
			head=n1;
			return;
		}
		reverseRecur(n2, n2.getNext());
		n2.setNext(n1);
	}
}
