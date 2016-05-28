package Sorting;

public class SelectionSort {

	/*
	 * Selection Sort
	 */
	static void selectionSort(int arr[]) {
		if (arr.length <= 1)
			return;
		
		int temp, min;
		
		// Run the loop till the second to last element
		for (int i=0; i<arr.length-1; i++) {
			// Use i as the min value
			min = i;
			// For all elements from i+1 to the end of the list, find the min element	
			for (int j=i+1; j<arr.length; j++) {
				if (arr[j] < arr[min])
					min = j;	
			}
			if (min != i) {
				temp = arr[i];
				arr[i] = arr[min];
				arr[min] = temp;
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
		
		selectionSort(arr);
		System.out.print("Sorted Array: ");
		for (i=0; i<arr.length-1; i++)
			System.out.print(arr[i] + ", ");
		System.out.print(arr[i]);
	}

}
