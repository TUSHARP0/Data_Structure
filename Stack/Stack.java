package Stack;

public class Stack<T>{
	private T[] arr;
	private int size;
	private int top;
	
	public Stack(int size) {
		this.size=size;
		top=-1;
		arr=(T[])new Object[size];
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	
	public boolean isFull() {
		return size == top-1;
	}
	
	public T push(T data) {
		if(isFull()) {
			return null;
		}
		return arr[++top]=data;
	}
	
	public T pop() {
		if(isEmpty()) {
			return null;
		}
		return arr[top--];
	}
	
	public T peek() {
		if(isEmpty()) {
			return null;
		}
		return arr[top];
	}
}


