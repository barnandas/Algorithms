package Stacks;

class Node {
	int data;
	Node next = null;
	public Node (int d) {
		data = d;
	}
}

public class Stack {

	Node top = null;
	
	/*
	 * Push
	 */
	void push(int data) {
		Node n = new Node(data);
		n.next = top;
		top = n;
	}
	
	/*
	 * Pop
	 */
	int pop() {
		if (top == null) {
			System.out.println("Stack is empty");
			return Integer.MIN_VALUE;
		}
		int topVal = top.data;
		top = top.next;
		return topVal;
	}
	
	/*
	 * Peek
	 */
	int peek() {
		return top.data;
	}
	
	/*
	 * Get size
	 */
	int size() {
		int size = 0;
		
		Node p = top;
		while (p != null) {
			size++;
			p = p.next;
		}
		
		return size;
	}
	
	/*
	 * Print stack
	 */
	void print() {
		if (top == null) {
			System.out.println("Stack is empty");
			return;
		}
		
		System.out.print("Top: ");
		Node p = top;
		while (p.next != null) {
			System.out.print(p.data);
			System.out.print(" -> ");
			p = p.next;
		}
		System.out.println(p.data);
	}
	
	public static void main(String[] args) {
		Stack s = new Stack();
		s.push(10);
		s.push(20);
		s.push(30);
		s.print();
		//System.out.println(s.peek());
		//System.out.println(s.size());
		
		s.pop();
		s.print();
		
		s.pop();
		s.print();
		
		s.pop();
		s.pop();
	}

}
