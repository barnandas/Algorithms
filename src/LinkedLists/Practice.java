package LinkedLists;

// Linked list node class
class ListNode<T> {
	public T data;
	public ListNode<T> next = null;
	
	public ListNode (T d) {
		data = d;
	}
}

public class Practice {

	// Reverse a linked list
	public static ListNode<Integer> reverseList(ListNode<Integer> head) {
		if (head == null || head.next == null) {
			return head;
		}
		
		ListNode<Integer> prev = head;
		ListNode<Integer> cur = head.next;
		ListNode<Integer> next = head.next.next;
		
		prev.next = null;
		
		while (next != null) {
			cur.next = prev;
			prev = cur;
			cur = next;
			next = next.next;
		}
		
		// Making the last link
		cur.next = prev;
		return cur;
	}
	
	// Print linked list
	public static void print(ListNode<Integer> head) {
		while (head.next != null) {
			System.out.print(head.data + " -> ");
			head = head.next;
		}
		System.out.print(head.data);
	}
	
	// Add a value to the linked list
	public static void add (ListNode<Integer> head, int x) {
		if (head == null) {
			head = new ListNode<Integer>(x);
		}
		
		while (head.next != null) {
			head = head.next;
		}
		head.next = new ListNode<Integer>(x);
	}
	
	public static void main(String[] args) {
		ListNode<Integer> head = new ListNode<Integer>(1);
		add(head, 2);
		add(head, 3);
		add(head, 4);
		add(head, 5);
		add(head, 6);
		add(head, 7);
		add(head, 8);
		
		System.out.println("Original list: ");
		print(head);
		System.out.println();
		
		System.out.println("Reverse list: ");
		ListNode<Integer> temp = reverseList(head);
		print(temp);
		System.out.println();
	}

}
