package Heap;

public class PriorityQueue extends Heap{

	public PriorityQueue(int maxS) {
		maxSize = maxS;
		arr = new int[maxSize];
		size = 0;
	}
	
	/*
	 * GetMax
	 */
	public static int getMax() {
		if (size <= 0) {
			System.out.println("Heap is empty");
			return Integer.MIN_VALUE;
		}
		return arr[0];	
	}
	
	/*
	 * Insert
	 */
	public static void insert(int p) {
		if (size > maxSize) {
			System.out.println("Heap is full");
			return;
		}
		arr[size] = p;
		shiftUp(size);
		size++;
	}
	
	/*
	 * Extract max
	 */
	public static int extractMax() {
		if (size == 0) {
			System.out.println("Heap is empty");
			return Integer.MIN_VALUE;
		}
		int ret = arr[0];
		arr[0] = arr[size-1];
		size--;
		shiftDown(0);
		return ret;
	}
	
	/*
	 * Change priority
	 */	
	public static void changePriority(int i, int p) {
		if (i >= size || i < 0) {
			System.out.println("Illegal location");
			return;
		}
		arr[i] = p;
		if (arr[i] > arr[parent(i)])
			shiftUp(i);
		else
			shiftDown(i);
	}
	
	/*
	 * Remove
	 */	
	public static int remove(int i) {
		if (i >= size || i < 0) {
			System.out.println("Illegal location");
			return Integer.MIN_VALUE;
		}
		
		int ret = arr[i];
		arr[i] = Integer.MAX_VALUE;
		shiftUp(i);
		extractMax();
		return ret;
	}
	
	public static void main(String[] args) {
		
		// Creating a bag of elements
		int a[] = {42, 14, 18, 29, 7, 18, 11, 12, 7};
		System.out.print("Original Array: ");
		int i;
		for (i=0; i<a.length-1; i++)
			System.out.print(a[i] + ", ");
		System.out.print(a[i]);

		// Create the priority queue
		int max = 15;
		PriorityQueue pq = new PriorityQueue(max);
		for (i=0; i<a.length; i++)
			pq.insert(a[i]);
		System.out.print("\nAfter initial insertion: ");
		pq.print();
			
		// Get max
		System.out.println("\nMax Val: " + pq.getMax());
		
		// Insert
		pq.insert(32);
		System.out.print("\nInsert 32: ");
		pq.print();
		
		// Extract max
		pq.extractMax();
		System.out.print("\nExtract max: ");
		pq.print();
		
		// Change priority
		pq.changePriority(4, 100);
		System.out.print("\nChange priority of 4 to 100: ");
		pq.print();
		
		// Remove
		pq.remove(2);
		System.out.print("\nRemove 2: ");
		pq.print();
	}

}
