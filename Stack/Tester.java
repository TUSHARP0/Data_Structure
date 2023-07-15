package Stack;

public class Tester {
	public static void main(String[] args) {
		
		System.out.println("Stack");
		Stack<Integer> stack= new Stack<Integer>(5);
		System.out.println("Push: "+stack.push(10));
		System.out.println("Push: "+stack.push(20));
		System.out.println("Pop: "+stack.pop());
		System.out.println("Peek: "+stack.peek());
		
		System.out.println();
		System.out.println("Double Stack");
		DoubleStack ds= new DoubleStack(5);
		System.out.println("Push: "+ds.push1(10));
		System.out.println("Push: "+ds.push1(5));
		System.out.println("Push: "+ds.push2(15));
		System.out.println("Push: "+ds.push2(5));
		
		System.out.println("Pop1: "+ds.pop1());
		System.out.println("Pop2: "+ds.pop2());
		
		
		
	}
		
}
