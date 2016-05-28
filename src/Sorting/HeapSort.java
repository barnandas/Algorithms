package Sorting;

import Heap.*;

public class HeapSort extends Heap{

	public static void sort(int a[]) {
		if (a.length == 0) {
			System.out.println("Array is empty");
			return;
		}
		
		buildHeap(a);
		int temp;
		while (size > 1) {
			temp = arr[0];
			arr[0] = arr[size-1];
			arr[size-1] = temp;
			size--;
			shiftDown(0);
		}		
	}
	
	public static void main(String[] args) {
		int a[] = {16, 4, 10, 14, 7, 9, 3, 2, 8, 1};
		System.out.print("Original Array: ");
		int i;
		for (i=0; i<a.length-1; i++)
			System.out.print(a[i] + ", ");
		System.out.print(a[i]);
		
		sort(a);
		System.out.print("\nSorted Array: ");
		print();
	}

}
