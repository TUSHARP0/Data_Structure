package bst;

import java.util.Stack;

public class BinarySearchTree {
	private Node root;
	
	public BinarySearchTree() {
	root=null;
	}

	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}
	
	public boolean insert(int data) {
		Node newnode= new Node(data);
		if(root == null) {
			root=newnode;
			return true;
		}
		Node temp=root;
		while(true) {
			if(temp.getData() == data) {
				return false;
			}
			if(temp.getData() > data) {
				if(temp.getLeft() == null) {
					temp.setLeft(newnode);
					return true;
				}
				temp=temp.getLeft();
			}else {
				if(temp.getRight() == null) {
					temp.setRight(newnode);
					return true;
				}
				temp=temp.getRight();
			}
		}
	}
	
	public void inOrder(Node node) {
		if(node == null) {
			return;
		}
		inOrder(node.getLeft());
		System.out.print(node.getData()+" ");
		inOrder(node.getRight());
	}
	
	public void preOrder(Node node) {
		if(node==null) {
			return;
		}
		System.out.print(node.getData()+" ");
		preOrder(node.getLeft());
		preOrder(node.getRight());
	}
	
	public void postOrder(Node node) {
		if(node == null) {
			return;
		}
		postOrder(node.getLeft());
		postOrder(node.getRight());
		System.out.print(node.getData()+" ");
	}
	
	public boolean find(int data) {
		if(root == null) {
			return false;
		}
		Node temp=root;
		while(temp!=null) {
			if(data == temp.getData()) {
				return true;
			}
			if(data < temp.getData()) {
				temp=temp.getLeft();
			}
			else {
				temp=temp.getRight();
			}
		}
		return false;
	}
	
	public int max() {
		if(root == null) {
			return -1;
		}
		Node temp=root;
		while(temp.getRight()!=null) {
			temp=temp.getRight();
		}
		return temp.getData();
	}
	
	public int min() {
		if(root == null) {
			return -1;
		}
		Node temp=root;
		while(temp.getLeft()!=null) {
			temp=temp.getLeft();
		}
		return temp.getData();
		
	}
	
	public void inorder() {
		Node temp=root;
		Stack<Node> s= new Stack<>();
		while(temp!=null || !s.isEmpty()) {
			while(temp != null) {
				s.push(temp);
				temp=temp.getLeft();
				
			}
			temp=s.pop();
			System.out.print(temp.getData() + " ");
			temp=temp.getRight();
		}
		System.out.println();
	}
	
	public void preOrder() {
		Node temp=root;
		Stack<Node> s= new Stack<>();
		while(temp!=null || !s.isEmpty()) {
			while(temp!=null) {
				System.out.print(temp.getData()+" ");
				s.push(temp);
				temp=temp.getLeft();
			}
			temp=s.pop().getRight();
		}
	}
}
