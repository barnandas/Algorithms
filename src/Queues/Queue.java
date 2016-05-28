package Queues;

class Node {
	int data;
	Node next = null;
	public Node(int d) {
		data = d;
	}
}

public class Queue {
	Node first = null, last = null;
	
	void enqueue(int data) {
		Node n = new Node(data);
		if (first == null) {
			first = last = n;
		} else {
			last.next = n;
			last = n;
		}
	}
	
	int dequeue() {
		if (first == null) {
			System.out.println("Queue is empty");
			return Integer.MIN_VALUE;
		}
		
		int firstVal = first.data;
		first = first.next;
		return firstVal;
	}
	
	int size() {
		int size = 0;
		Node p = first;
		while (p != null) {
			size++;
			p = p.next;
		}
		return size;
	}
	
	void print() {
		if (first == null) {
			System.out.println("Queue is empty");
			return;
		}
			
		Node p = first;
		
		System.out.print("First: ");
		while (p.next != null) {
			System.out.print(p.data);
			System.out.print(" -> ");
			p = p.next;
		}
		System.out.print(p.data);
		System.out.print(" :Last\n");
	}
	
	public static void main(String[] args) {
		Queue q = new Queue();
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.print();

		q.dequeue(); q.dequeue(); q.dequeue(); q.dequeue();
		q.print();
		
	}

}
