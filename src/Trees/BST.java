package Trees;

import java.util.*;

public class BST {

	class Node {
		int data;
		Node left = null;
		Node right = null;
		Node parent = null;
		
		public Node (int d) {
			data = d;
		}
	}
	
	/*
	 * Find (recursive)
	 */
	public static Node find(int k, Node root) {
		if (root == null || root.data == k)
			return root;
		
		if (k <= root.data)
			find(k, root.left);
		else
			find(k, root.right);
		
		return root;
	}

	/*
	 * Find (iterative)
	 */
	public static Node find_iterative(int k, Node root) {
		while (root != null || root.data != k) {
			if (k <= root.data)
				find(k, root.left);
			else
				find(k, root.right);
		}
		return root;
	}
	
	/*
	 * Return node with minimum value
	 */
	public static Node min(Node root) {
		while (root.left != null)
			root = root.left;
		return root;
	}
	
	/*
	 * Return node with maximum value
	 */
	public static Node max(Node root) {
		while (root.right != null)
			root = root.right;
		return root;
	}
	
	/*
	 * Insert
	 */
	public static void insert(Node x, Node root) {
		
	}
	
	/*
	 * Delete
	 */
	public static void delete(Node x, Node root) {
		
	}
	
	/*
	 * Successor
	 */
	public static Node successor(Node x) {
		
		
		
		return x;
	}
	
	/*
	 * Predecessor
	 */
	public static Node predecessor(Node x) {
		
		
		
		return x;
	}
	
	/*
	 * Range search
	 */
	public static LinkedList<Node> rangeSearch(int x, int y, Node root) {
		LinkedList<Node> list = new LinkedList<Node>();
		
		
		return list;
	}
	
	/*
	 * Nearest neighbors
	 */
	public static LinkedList<Node> neareastNeighbors(int x, Node root) {
		LinkedList<Node> list = new LinkedList<Node>();
		
		
		return list;
	}
	
	/*
	 * Inorder traversal
	 */
	public static void printInorder(Node root) {
		if (root == null)
			return;
		printInorder(root.left);
		System.out.println(root.data + " ");
		printInorder(root.right);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
