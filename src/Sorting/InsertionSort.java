package Sorting;

public class InsertionSort {

	/*
	 * Insertion Sort
	 */
	static void insertionSort(int arr[]) {
		if (arr.length <= 1)
			return;
		
		int temp, j;
		
		for (int i=0; i<arr.length; i++) {
			temp = arr[i];
			j = i;
			while (j>0 && arr[j-1]>temp) {
				arr[j] = arr[j-1];
				j--;
			}
			arr[j] = temp;
		}
	}
	
	public static void main(String[] args) {
		int arr[] = {16, 0, 5, 14, 7, 89, 67, 2, 8, 1};
		
		System.out.print("Original Array: ");
		int i;
		for (i=0; i<arr.length-1; i++)
			System.out.print(arr[i] + ", ");
		System.out.print(arr[i] + "\n");
		
		insertionSort(arr);
		System.out.print("Sorted Array: ");
		for (i=0; i<arr.length-1; i++)
			System.out.print(arr[i] + ", ");
		System.out.print(arr[i]);
	}

}
