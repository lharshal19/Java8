
public class DSAProgram03 {

	// Bubble Sort
	/*Time Complexity: 
		• Best Case: O(n) (when the list is already sorted) 
		• Average Case: O(n²)*/
	/*
		public static void main(String[] args) {
			//int[] arr = { 5, 1, 4, 2, 8 };
			int[] arr = { 1, 2, 3 };
			bubbleSort(arr);
			for (int i : arr) {
				System.out.print(i + " ");
			}
		}
	
		public static void bubbleSort(int[] arr) {
	
			int length = arr.length;
			boolean alreadySorted;
			for (int i = 0; i < length - 1; i++) {
				alreadySorted = false;
				for (int j = 0; j < length - i - 1; j++) {
					if (arr[j] > arr[j + 1]) {
						int temp = arr[j];
						arr[j] = arr[j + 1];
						arr[j + 1] = temp;
						alreadySorted = true;
					}
				}
				if (!alreadySorted)
					break;
			}
		}
		*/
	//======================================
	
	// Binary Search
	/* Best Case - O(1) ( middle element )
	 * Average case - O(log n)
	 */
	

	public static void main(String[] args) {
		int[] arr = { 2, 3, 5, 7, 11, 13, 17 };
		int target = 13;
		System.out.println("Index of " + target + ": " + binarySearch(arr, target));
	
		//System.out.println("Index of " + target + ": " + binarySearch(arr, 0, arr.length - 1, target));
	}
	
	//Method 1 Iterative Approach
	public static int binarySearch(int[] arr, int target) {
		int left = 0;
		int right = arr.length - 1;
	
		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (arr[mid] == target) {
				return mid;
			} else if (arr[mid] < target) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return -1;
	}
	
	//Method 2 Recursive Approach
	public static int binarySearch(int[] arr, int left, int right, int target) {
		if (left > right) {
			return -1;
		}
		int mid = left + (right - left) / 2;
		if (arr[mid] == target) {
			return mid;
		} else if (arr[mid] < target) {
			return binarySearch(arr, mid + 1, right, target);
		} else {
			return binarySearch(arr, left, mid - 1, target);
		}
	}
	
	
	//==========================

}

// Bubble Sort
//	Binary Search
//
//
//
//
//
//
