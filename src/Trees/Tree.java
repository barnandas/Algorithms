package Trees;

import java.util.*;

class Node {
	int data;
	Node left = null;
	Node right = null;
	public Node(int d) {
		data = d;
	}
}

public class Tree {

	Node root = null;
	
	/*
	 * Height of a tree
	 */
	public static int height(Node root) {
		if (root == null)
			return 0;
		else 
			return (1 + Math.max(height(root.left), height(root.right)));
	}
	
	/*
	 * Size of a tree
	 */
	public static int size(Node root) {
		if (root == null)
			return 0;
		else 
			return (1 + size(root.left) + size(root.right));
	}
	
	/*
	 * In-order Traversal
	 */
	public static void inorder(Node root) {
		if (root == null)
			return;
		inorder(root.left);
		System.out.print(root.data + " ");
		inorder(root.right);
	}
	
	/*
	 * Pre-order Traversal
	 */
	public static void preorder(Node root) {
		if (root == null)
			return;
		System.out.print(root.data + " ");
		preorder(root.left);
		preorder(root.right);
	}
	
	/*
	 * Post-order Traversal
	 */
	public static void postorder(Node root) {
		if (root == null)
			return;
		postorder(root.left);
		postorder(root.right);
		System.out.print(root.data + " ");
	}
	
	/*
	 * BFS
	 */
	public static void bfs(Node root) {
		if (root == null) {
			System.out.println("Tree is empty");
			return;
		}
		
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		Node temp;
		
		while (!q.isEmpty()) {
			temp = q.remove();
			System.out.print(temp.data + " ");
			if (temp.left != null)
				q.add(temp.left);
			if (temp.right != null)
				q.add(temp.right);
		}
	}
	
	public static void main(String[] args) {
		Node n10 = new Node(10);
		Node n20 = new Node(20);
		Node n30 = new Node(30);
		Node n40 = new Node(40);
		Node n50 = new Node(50);
		Node n60 = new Node(60);
		Node n70 = new Node(70);
		Node n80 = new Node(80);
		Node n90 = new Node(90);
		Node n100 = new Node(100);
		
		n50.left = n30;
		n50.right = n70;
		n30.left = n20;
		n30.right = n40;
		n70.left = n60;
		n70.right = n80;
		n80.right = n90;

		Node root = n50;
		
		int height = height(root);
		System.out.println("Height = " + height);
		
		int size = size(root);
		System.out.println("Size = " + size);
		
		System.out.print("In-order: ");
		inorder(root);
		System.out.println();
		
		System.out.print("Pre-order: ");
		preorder(root);
		System.out.println();
		
		System.out.print("Post-order: ");
		postorder(root);
		System.out.println();
		
		System.out.print("BFS: ");
		bfs(root);
		System.out.println();
	}

}
