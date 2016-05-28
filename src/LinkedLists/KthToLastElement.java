package LinkedLists;

public class KthToLastElement {

	public static int kthToLastElement(NodeLL head, int k) {
		if (head == null || k<0)
			return Integer.MIN_VALUE;
		
		NodeLL p = head, q = head;
		for (int i=0; i<k; i++)
			q = q.next;
		if (q == null || q.next == null)
			return Integer.MIN_VALUE;
		
		while (p.next != null || q.next != null) {
			p = p.next;
			q = q.next;
		}
		if (p == null)
			return Integer.MIN_VALUE;
		return p.data;		
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

		int val = kthToLastElement(p, 100);
		System.out.println(val);
	}

}
