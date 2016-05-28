package LinkedLists;

public class NodeLL {
	int data;
	NodeLL next = null;
	
	public NodeLL(int d) {
		data = d;
	}
	
	void add(int d) {
		NodeLL n = new NodeLL(d);
		NodeLL p = this;
		while (p.next != null)
			p = p.next;
		p.next = n;
		
	}
	
	void print() {
		if (this == null) {
			System.out.println("List is empty");
			return;
		}
		NodeLL p = this;
		while (p.next != null) {
			System.out.print(p.data);
			System.out.print(" -> "); 
			p = p.next;
		}
		System.out.print(p.data);
		System.out.println();
	}
}
