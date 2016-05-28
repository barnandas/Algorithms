package Heap;

public class Heap {

	public static int arr[];
	public static int size = 0;
	public static int maxSize = 0;
	
	public Heap() {
		
	}
	
	public Heap(int maxS) {
		maxSize = maxS;
		arr = new int[maxSize];
	}
	
	public Heap(int a[]) {
		arr = a;
		maxSize = size = a.length;
	}
	
	/*
	 * Get parent
	 */
	public static int parent(int i) {
		return (i-1)/2;
	}
	
	/*
	 * Get left child
	 */
	public static int leftChild(int i) {
		return 2*i+1;
	}
	
	/*
	 * Get right child
	 */
	public static int rightChild(int i) {
		return 2*i+2;
	}
	
	/*
	 * Shift Up
	 */
	public static void shiftUp(int i) {
		int temp;
		while ( i > 0 && arr[i] > arr[parent(i)] ) {
			temp = arr[i];
			arr[i] = arr[parent(i)];
			arr[parent(i)] = temp;
			i = parent(i);
		}
	}
	
	/*
	 * Shift Down
	 */
	public static void shiftDown(int i) {
		int temp;
		int maxIndex = i;
		int left = leftChild(i);
		int right = rightChild(i);
		
		if ( left < size && arr[left] > arr[maxIndex])
			maxIndex = left;
		if ( right < size && arr[right] > arr[maxIndex] )
			maxIndex = right;
		
		if (i != maxIndex) {
			temp = arr[i];
			arr[i] = arr[maxIndex];
			arr[maxIndex] = temp;
			shiftDown(maxIndex);
		}
	}
	
	/*
	 * Build head
	 */
	public static void buildHeap(int a[]) {
		arr = a;
		maxSize = size = a.length;
		for (int i=(size-1)/2; i>=0; i--)
			shiftDown(i);
	}
	
	/*
	 * Print heap
	 */
	public static void print() {
		if (size <= 0) {
			System.out.println("Heap is empty");
			return;
		}
		int i;
		for (i=0; i<arr.length-1; i++)
			System.out.print(arr[i] + ", ");
		System.out.print(arr[i]);
	}
	
	public static void main(String[] args) {
		//int a[] = {16, 4, 10, 14, 7, 9, 3, 2, 8, 1};
		int a[] = {27, 17, 3, 16, 13, 10, 1, 5, 7, 12, 4, 8, 9, 0};
		System.out.print("Original Array: \t");
		int i;
		for (i=0; i<a.length-1; i++)
			System.out.print(a[i] + ", ");
		System.out.print(a[i]);
		
		buildHeap(a);
		System.out.print("\nHeap: \t\t\t");
		print();
	}

}
