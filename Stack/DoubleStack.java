package Stack;

public class DoubleStack {
	private int[] arr;
	private int size;
	private int top1,top2;
	
	public DoubleStack(int size) {
		this.size=size;
		top1=-1;
		top2=size;
		arr=new int[size];
	}
	
	public boolean isEmpty1() {
		return top1 == -1;
	}
	
	public boolean isEmpty2() {
		return top2 == size;
	}
	
	public boolean isFull() {
		return (top1+1)==top2;
	}
	
	public int push1(int data) {
		if(isFull()) {
			return -1;
		}
		return arr[++top1]=data;
	}
	
	public int push2(int data) {
		if(isFull()) {
			return -1;
		}
		return arr[--top2]=data;
	}
	
	public int pop1() {
		if(isEmpty1()) {
			return -1;
		}
		return arr[top1--];
	}
	
	public int pop2() {
		if(isEmpty2()) {
			return -1;
		}
		return arr[top2++];
	}
	
}
