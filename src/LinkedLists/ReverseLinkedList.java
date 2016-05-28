package LinkedLists;

public class ReverseLinkedList {

	public static NodeLL reverseLinkedList(NodeLL head) {
		if (head == null)
			return null;
		if (head.next == null)
			return head;
		
		NodeLL prev, cur, next;
		prev = head;
		cur = prev.next;
		next = cur.next;
		prev.next = null;
		
		while (next != null) {
			cur.next = prev;
			prev = cur;
			cur = next;
			next = next.next;
			
		}
		cur.next = prev;
		head = cur;
		
		return head;
	}
	
	public static void main(String[] args) {
		NodeLL p = new NodeLL(10);
		p.add(20);
		p.add(30);
		p.add(40);
		p.add(50);
		p.add(60);
		p.add(70);
		p.add(80);
		p.add(90);
		p.add(100);
		p.print();
		
		
		NodeLL rev = reverseLinkedList(p);
		rev.print();
	}

}
