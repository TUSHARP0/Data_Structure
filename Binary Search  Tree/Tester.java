package bst;

public class Tester {
	public static void main(String[] args) {
		BinarySearchTree bst= new BinarySearchTree();
		bst.insert(50);
		bst.insert(40);
		bst.insert(30);
		bst.insert(60);
		bst.insert(45);
		
		System.out.println("Inorder: ");
		bst.inOrder(bst.getRoot());
		System.out.println();
		
		System.out.println("Pre Order:");
		bst.preOrder(bst.getRoot());
		System.out.println();
		
		System.out.println("Post Order:");
		bst.postOrder(bst.getRoot());
		System.out.println();
		
		System.out.println(bst.find(30));
		System.out.println();
		
		System.out.println(bst.max());
		System.out.println();
		
		System.out.println(bst.min());
		System.out.println();
		
		System.out.println("In Order Using Stack: ");
		bst.inorder();
		System.out.println();
		
		System.out.println("Pre Order Using Stack: ");
		bst.preOrder();
		
		
	}
	
	
	
}
