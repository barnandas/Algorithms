package Sorting;

public class BubbleSort {

	/*
	 * Bubble Sort
	 */
	static void bubbleSort(int arr[]) {
		if (arr.length <= 1)
			return;
		
		int temp;
		
		// Run outer loop till the second last element
		for (int i=0; i<arr.length-1; i++) {
			// Run inner loop from the beginning of the array to the element for which length-i element
			for (int j=0; j<arr.length-1-i; j++) {
				// If element at location j is greater than element at location j+1
				if (arr[j] > arr[j+1]) {
					// Swap
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int arr[] = {16, 0, -5, 14, 7, 9, 3, 2, 8, 1};
		
		System.out.print("Original Array: ");
		int i;
		for (i=0; i<arr.length-1; i++)
			System.out.print(arr[i] + ", ");
		System.out.print(arr[i] + "\n");
		
		bubbleSort(arr);
		System.out.print("Sorted Array: ");
		for (i=0; i<arr.length-1; i++)
			System.out.print(arr[i] + ", ");
		System.out.print(arr[i]);
	}

}
