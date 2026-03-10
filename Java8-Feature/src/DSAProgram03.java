
public class DSAProgram03 {

	// Bubble Sort
	/*Time Complexity: 
		• Best Case: O(n) (when the list is already sorted) 
		• Average Case: O(n²)*/
	
		public static void main(String[] args) {
			//int[] arr = { 5, 1, 4, 2, 8 };
			int[] arr = { 1, 3, 2 };
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
		
	//======================================

	// Binary Search
	/* Best Case - O(1) ( middle element )
	 * Average case - O(log n)
	 */

	/*public static void main(String[] args) {
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
	}*/

	//==========================
	/*
	public static void main(String[] args) {
		int[] arr = { 38, 27, 43, 3, 9, 82, 10 };
		mergeSort(arr, 0, arr.length - 1);
		for (int num : arr) {
			System.out.print(num + " ");
		}
	}
	
	public static void mergeSort(int[] arr, int left, int right) {
		if (left < right) {
			int mid = left + (right - left) / 2;
			mergeSort(arr, left, mid);
			mergeSort(arr, mid + 1, right);
	
			merge(arr, left, mid, right);
		}
	}
	
	private static void merge(int[] arr, int left, int mid, int right) {
		int n1 = mid - left + 1;
		int n2 = right - mid;
		int[] L = new int[n1];
		int[] R = new int[n2];
		System.arraycopy(arr, left, L, 0, n1);
		System.arraycopy(arr, mid + 1, R, 0, n2);
	
		int i = 0, j = 0, k = left;
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				arr[k++] = L[i++];
			} else {
				arr[k++] = R[j++];
			}
		}
	
		while (i < n1)
			arr[k++] = L[i++];
		while (j < n2)
			arr[k++] = R[j++];
	}
	*/

}

// Bubble Sort
//	Binary Search
//	Merged Sort
//
//
//
//
//
