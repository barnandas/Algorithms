package LinkedLists;

/**
 * Linked list node
 * @author barnandas
 *
 */
class Node {
	int data;
	Node next = null;
	
	public Node() {
		data = 0;
	}
	
	public Node(int d) {
		this.data = d;
	}
}

/**
 * Linked list main class
 * @author barnandas
 *
 */
public class LinkedList {
	
	Node head = null;
	
	/*
	 * Add a node at the end of the linked list
	 */
	Node add(int data) {
		Node n = new Node(data);
		if (head == null)
			head = n;
		else {
			Node p = head;
			while (p.next != null)
				p = p.next;
			p.next = n;
		}
			
		return head;
	}
	
	/*
	 * Add a node at the front of the linked list
	 */
	Node addFirst(int data) {
		Node n = new Node(data);
		if (head == null)
			head = n;
		else {
			n.next = head;
			head = n;
		}
		
		return head;
	}
	
	/*
	 * Add a node at the end of the linked list
	 */
	Node addLast(int data) {
		return add(data);
	}
	
	/*
	 * Add at location
	 */
	Node addAt(int i, int data) {
		if (i<-1 || (i+1)>this.size()) {
			System.out.println("Invalid node location");
			return head;
		}
		
		Node n = new Node(data);
		
		if (i==-1) {
			head = n;
			return head;
		}
				
		Node p = head;
		for (int loc=0; loc < i; loc++)
			p = p.next;
		n.next = p.next;
		p.next = n;

		return head;
	}
	
	/*
	 * Removes node at location i (starts with location 0)
	 */
	Node remove(int i) {
		if (i<0 || (i+1)>this.size()) {
			System.out.println("Invalid node location");
			return head;
		}
		if (head == null)
			return head;
		if (head.next == null) {
			head = null;
			return head;
		}
		if (i==0)
			return (removeFirst());
		
		Node prev = head;
		Node p = prev.next; 
		for (int loc=1; loc<i; loc++) {
			prev = p;
			p = p.next;
		}
		prev.next = p.next;
		
		return head;
	}
	
	/*
	 * Removes first element
	 */
	Node removeFirst() {
		if (head == null)
			return null;
		
		head = head.next;
		
		return head;
	}
	
	/*
	 * Removes the last node
	 */
	Node removeLast() {
		if (head == null)
			return null;
		if (head.next == null) {
			head = null;
			return head;
		}
			
		Node p = head;
		while (p.next.next != null)
			p = p.next;
		p.next = null;
		
		return head;
	}
	
	/*
	 * Get the size of the linked list
	 */
	int size() {
		int size = 0;
		
		Node p = head;
		while (p != null) {
			p = p.next;
			size++;
		}
		return size;
	}

	/*
	 * Print the linked list
	 */
	void print() {
		if (head == null) {
			System.out.println("Empty linked list");
			return;
		}
		
		Node p = head;
		while (p.next != null) {
			System.out.print(p.data);
			System.out.print(" -> ");
			p = p.next;
		}
		System.out.print(p.data);
		System.out.println();
	}
	
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		
		list.print();
		System.out.println(list.size());
		
		//list.addLast(35);	
		
		list.remove(0);
		list.print();
		System.out.println(list.size());
	}

}
