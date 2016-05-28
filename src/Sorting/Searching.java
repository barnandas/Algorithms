package Sorting;

public class Searching {

	/*
	 * Linear Search
	 */
	static int linearSearch(int key, int arr[]) {
		if (arr.length == 0)
			return -1;
		
		for (int i=0; i<arr.length; i++) {
			if (key == arr[i])
				return i;
		}
		return -1;
	}
	
	/*
	 * Binary Search
	 */
	static int binarySearch(int key, int arr[], int min, int max) {
		if (max < min)
			return -1;
		
		int mid = (min+max)/2;
		
		if (key < arr[mid])
			return binarySearch(key, arr, 0, mid-1);
		else if (key > arr[mid])
			return binarySearch(key, arr, mid+1, max);
		else
			return mid;
		
	}
	
	
	public static void main(String[] args) {
		
		// Testing linear search
/*		int arr[] = {40,10,20,60,50,30,80,90,100};
		int key = 80;
		System.out.println("Index of key = " + linearSearch(key, arr));*/
		
		// Testing binary search
		int arr[] = {10,20,30,40,50,60,70,80,90,100};
		int key = 80;
		int min = 0, max = 9;
		System.out.println("Index of key = " + binarySearch(key, arr, min, max));
	}

}
