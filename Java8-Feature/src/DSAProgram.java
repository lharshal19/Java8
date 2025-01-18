import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DSAProgram {

	//Check two strings Anagram or not
	/*public static void main(String[] args) {
	
		String str1 = "Bored";
		String str2 = "Robed";
	
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
	
		char[] str1charArray = str1.toCharArray();
		char[] str2charArray = str2.toCharArray();
		if (str1.length() == str2.length()) {
			// sort the char array
			Arrays.sort(str1charArray);
			Arrays.sort(str2charArray);
			// if the sorted char arrays are same or identical
			// then the strings are anagram
			boolean result = Arrays.equals(str1charArray, str2charArray);
			if (result) {
				System.out.println(str1 + " and " + str2 + " are anagrams of each other.");
			} else {
				System.out.println(str1 + " and " + str2 + " are not anagrams of each other.");
			}
		} else {
			System.out.println(str1 + " and " + str2 + " are not anagrams of each other.");
		}
	
		//Method 2
	
				for (char ch : str1.toCharArray()) {
					int index = str2.indexOf(ch);
					if (index != -1) {
						str2 = str2.substring(0, index) + str2.substring(index + 1);
					}
				}
				System.out.println("str1 : "+str1+ "  str2 : "+str2);
				if (str2.isEmpty())
					System.out.println("Anagram");
		
		//Method 3
		Map<Character, Integer> map = new HashMap();
		for (char ch : str1.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}
		System.out.println(map);
		for (char ch : str2.toCharArray()) {
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) - 1);
				if (map.get(ch) == 0)
					map.remove(ch);
			}
		}
		System.out.println(map);
		System.out.print(" map : ");
		System.out.print(map.isEmpty() ? "Anagram" : "Not Anagram");
	
	}*/

	//======================
	// Binary Search

	/*public static void main(String[] args) {
		int[] arr = { 2, 3, 5, 7, 11, 13, 17 };
		int target = 7;
		System.out.println("Index of " + target + ": " + binarySearch(arr, target));
	
		System.out.println("Index of " + target + ": " + binarySearch(arr, 0, arr.length - 1, target));
	}
	
	//Method 1 Iterative Approach
	public static int binarySearch(int[] arr, int target) {
		int left = 0;
		int right = arr.length - 1;
	
		while (left <= right) {
			int mid = (left + (right - left)) / 2;
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
	// print all permutations of string in Java
	/*public static void main(String[] args) {
			String s = "cat";
			printallPermutns(s, "");
		}
	
		static void printallPermutns(String str, String str2) {
			if (str.length() == 0) {
				System.out.print(str2 + " ");
				return;
			}
			for (int i = 0; i < str.length(); i++) {
				char ch = str.charAt(i);
				String str3 = str.substring(0, i) + str.substring(i + 1);
				printallPermutns(str3, str2 + ch);
			}
		}*/

	//==========================
	//check whether the given input string is a palindrome
	/*public static void main(String[] args) {
		String str1 = "rotator";
		String revstr = reverseString(str1); //revstr=reverse string
		if (str1.equals(revstr)) {
			System.out.println("The string" + str1 + " is a Palindrome String.");
		} else {
			System.out.println("The string" + str1 + " is not a Palindrome String.");
		}
	}
	
	// a method for reversing a string
	public static String reverseString(String str2) {
		String revstr = "";
		for (int i = str2.length() - 1; i >= 0; i--) {
			revstr += str2.charAt(i);
		}
		return revstr;
	}*/

	//======================
	//check String object condition
	/*public static void main(String[] args) {
		String str1 = "scaler";                          //Line1
		String str2 = new String("scaler");      //Line2
		String str3 = str2.intern();                                       //Line 3
		System.out.println(str1 == str2);
		System.out.println(str1 == str3); //retrieve object from heap memory
		
		
	} */

	//======================
	//Given a string find out duplicate character and its count 
	/*public static void main(String[] args) {
		String input = "programmingggggg";
		findDuplicates(input);
	} 
	
	//Method 1 using HashMap O(n)
	public static void findDuplicates(String str) {
		Map<Character, Integer> map = new HashMap<>();
		char[] charArray = str.toCharArray();
		for (char c : charArray) {
			map.put(c, map.getOrDefault(c,0) + 1);
		}
	
		System.out.println("Duplicate characters and their counts:");
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey() + ": " + entry.getValue());
			}
		}
		map.entrySet().stream().forEach(System.out::println);
	}*/

	//===================
	//Fibonacci series
	/*public static void main(String[] args) {
		int a = 0, b = 1;
		int n = 10;
		System.out.print("Fibonacci Series: ");
		for (int i = 1; i <= n; i++) {
			System.out.print(a + " ");
			int next = a + b;
			a = b;
			b = next;
		}
	}
	
	public static int fibonacci(int n) {
		if (n <= 1) {
			return n; // Base cases
		}
		return fibonacci(n - 1) + fibonacci(n - 2); // Recursive relation
	}*/

	//========================
	//Find second largest number in an array?
	/*public static void main(String[] args) {
	
		int[] array = { 3, 5, 1, 4, 2 };
		int largest = 0;
		int secondLargest = 0;
		for (int num : array) {
			if (num > largest) {
				secondLargest = largest;
				largest = num;
			} else if (num > secondLargest && num != largest) {
				secondLargest = num;
			}
		}
		System.out.println(largest);
		System.out.println(secondLargest);
	
		//Method 2
		int secodMax = Arrays.stream(array).boxed().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst()
				.orElseThrow(() -> new IllegalArgumentException("No second largest element found."));
		System.out.println("maximum : " + secodMax);
	}*/

	//=========================
	//Rotates the array to the right by n positions.
	/*	public static void main(String[] args) {
			int[] array = { 1, 2, 3, 4, 5, 6, 7 };
			System.out.println("Original Array: " + Arrays.toString(array));
			int n = 2;
			if (array == null || array.length == 0 || n < 0) {
				throw new IllegalArgumentException("Invalid input.");
			}
	
			int length = array.length;
			int k = n % length; // Handle cases where n > length
	
			// Reverse the entire array
			reverse(array, 0, length - 1);
			// Reverse the first part
			reverse(array, 0, k - 1);
			// Reverse the  last part
			reverse(array, k, length - 1);
			System.out.println("Array after Left Rotation by 2: " + Arrays.toString(array));
		}
	
		private static void reverse(int[] array, int start, int end) {
			while (start < end) {
				int temp = array[start];
				array[start] = array[end];
				array[end] = temp;
				start++;
				end--;
			}
		}*/

	//========================
	//Move all 1s in an array to the right
	/*public static void main(String[] args) {
		int[] array = { 1, 2, 3, 1, 4, 1, 5 };
		System.out.println("Original Array: " + Arrays.toString(array));
	
		int n = array.length;
		int count = 0; // Pointer to place non-1 elements
	
		// Traverse the array and move non-1 elements to the front
		for (int i = 0; i < n; i++) {
			if (array[i] != 1) {
				array[count] = array[i];
				count++;
			}
		}
		// Fill the remaining positions with 1s
		while (count < n) {
			array[count] = 1;
			count++;
		}
		System.out.println("Modified Array: " + Arrays.toString(array));
	
		//swap to left position
		int left = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 1) {
				int temp = array[i];
				array[i] = array[left];
				array[left] = temp;
				left++;
			}
		}
		System.out.println("Modified Array: " + Arrays.toString(array));
	}*/

	//=================================
	//To sort an array containing only 0s, 1s, and 2s
	/*public static void main(String[] args) {
		int[] arr = { 0, 1, 2, 0, 1, 2, 1, 0 };
		System.out.println("Original Array: " + Arrays.toString(arr));
	
		int low = 0; // Position for 0
		int mid = 0; // Position for 1
		int high = arr.length - 1; // Position for 2
	
		while (mid <= high) {
			switch (arr[mid]) {
			case 0:
				// Swap arr[low] and arr[mid]
				int tempLow = arr[low];
				arr[low] = arr[mid];
				arr[mid] = tempLow;
				low++;
				mid++;
				break;
	
			case 1:
				mid++;
				break;
	
			case 2:
				// Swap arr[mid] and arr[high]
				int tempHigh = arr[mid];
				arr[mid] = arr[high];
				arr[high] = tempHigh;
				high--;
				break;
			}
		}
		System.out.println("Sorted Array: " + Arrays.toString(arr));
	}*/
	//=======================
	//  find the k-th non-repeating character in a string 
	/*	public static void main(String[] args) {
			String str = "swiss";
			int k = 2;
	
			if (str == null || str.isEmpty()) {
				System.out.println("str is empty");
			} else {
	
				Map<Character, Integer> charCountMap = new LinkedHashMap<>();
	
				// Count frequency of each character
				for (char ch : str.toCharArray()) {
					charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
				}
	
				// Iterate through the string to find the k-th non-repeating character
				int count = 0;
				for (char ch : str.toCharArray()) {
					if (charCountMap.get(ch) == 1) {
						count++;
						if (count == k) {
							System.out.println("The " + k + "-th non-repeating character is: " + ch);
						}
					}
				}
			}
			
			Optional<Character> firstNonRepeated = str.chars()
	.mapToObj(ch -> (char) ch)
	.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
	.entrySet()
	.stream()
	.filter(entry -> entry.getValue() == 1)
	.map(Map.Entry::getKey)
	.findFirst();
	
	System.out.println(firstNonRepeated.orElse(null));
			
		}*/

	//=======================
	//Replace spaces with %20
	/*public static void main(String[] args) {
		String input = "Mr John Smith";
		String str = input.replaceAll("\\s", "%20");
		System.out.println(str);
	}*/

	//=======================
	//find all lowercase characters in a string and convert them to uppercase
	/*public static void main(String[] args) {
			String input = "Hello World! 123 @abcDEF";
	
			//convert lower to upper case
			StringBuilder result = new StringBuilder();
	
			for (char ch : input.toCharArray()) {
				if (Character.isLowerCase(ch)) {
					result.append(Character.toUpperCase(ch)); // Convert to uppercase
				} else {
					result.append(ch); // Keep non-lowercase as is
				}
			}
			System.out.println("result : " + result);
	
			String collect2 = input.chars()
					.mapToObj(ch -> Character.isLowerCase(ch) ? Character.toUpperCase((char) ch) : (char) ch)
					.map(String::valueOf).collect(Collectors.joining());
			System.out.println("collect2 : " + collect2);
	
			//filter string words
			List<String> collect = Arrays.stream(input.split("\\s")).filter(i -> i.matches("[a-zA-Z]+"))
					.collect(Collectors.toList());
			System.out.println("collect : " + collect);
	
			//remove special character from string
			String replaceAll = input.replaceAll("[^a-zA-Z0-9\\s]", "");
			System.out.println("Remove special character : " + replaceAll);
	
			List<String> words = Arrays.stream(input.split("\\s")).filter(i -> i.matches("[a-zA-Z0-9\\s]+"))
					.collect(Collectors.toList());
			System.out.println("words : " + words);
	
			//To replace each uppercase character in a string with a space followed by its lowercase
			String lowerCase = input.replaceAll("([A-Z])", " $1").toLowerCase();
			System.out.println("lowerCase  :  " + lowerCase);
	
			StringBuilder result1 = new StringBuilder();
			for (char ch : input.toCharArray()) {
				if (Character.isUpperCase(ch)) {
					result1.append(' ').append(Character.toLowerCase(ch));
				} else {
					result1.append(ch);
				}
			}
			System.out.println("result1 : " + result1);
		}*/

	//=============================
	//Count number of binary strings without consecutive 1’s

	//===========================
	//Find the factorial of a number using recursion.
	/*public static void main(String[] args) {
		int number = 5; // Example input
		System.out.println("Factorial of " + number + " is: " + factorial(number));
	}
	
	public static int factorial(int n) {
		if (n == 0 || n == 1) {
			return 1; // Base case: 0! = 1! = 1
		}
		return n * factorial(n - 1); // Recursive case
	}*/

	//===========================

	//==============================
	//Find the median of One sorted arrays
	/*public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 5 }; // Example array
	
		System.out.println("Median: " + findMedian(nums));
	}
	
	public static double findMedian(int[] nums) {
		int n = nums.length;
		if (n % 2 == 1) {
			return nums[n / 2]; // Odd number of elements
		} else {
			return (nums[n / 2 - 1] + nums[n / 2]) / 2.0; // Even number of elements
		}
	}*/

	//=============================
	/*Input: 
	 * 	a[] = {1, 4, 7, 8, 10}
			b[] = {2, 3, 9}
		Output:
			a[] = {1, 2, 3, 4, 7}
			b[] = {8, 9, 10}*/
	/*public static void main(String[] args) {
		int[] a = { 1, 4, 7, 8, 10 };
		int[] b = { 2, 3, 9 };
	
		mergeAndSplit(a, b);
	
		System.out.println("a[] = " + Arrays.toString(a));
		System.out.println("b[] = " + Arrays.toString(b));
	}
	
	public static void mergeAndSplit(int[] a, int[] b) {
		int n = a.length;
		int m = b.length;
		int[] merged = new int[n + m];
		System.out.println("1 : " + Arrays.toString(merged));
		System.arraycopy(a, 0, merged, 0, n);
		System.out.println("2 : " + Arrays.toString(merged));
		System.arraycopy(b, 0, merged, n, m);
		System.out.println("3 : " + Arrays.toString(merged));
	
		// Sort the merged array
		Arrays.sort(merged);
		System.out.println("4 : " + Arrays.toString(merged));
	
		// Split the sorted array back into a and b
		for (int i = 0; i < n; i++) {
			a[i] = merged[i];
		}
		for (int i = 0; i < m; i++) {
			b[i] = merged[n + i];
		}
	}*/

	//============================
	// i/o : aabbbccc4  o/p : a2b3c4
	/*public static void main(String[] args) {
		String input = "aabbbcccc";
		String compressed = compressString(input);
		System.out.println("Input: " + input);
		System.out.println("Output: " + compressed);
	}
	
	public static String compressString(String str) {
		StringBuilder result = new StringBuilder();
		int count = 1;
	
		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i) == str.charAt(i - 1)) {
				count++;
			} else {
				result.append(str.charAt(i - 1)).append(count);
				count = 1;
			}
		}
		// Append the last character and its count
		result.append(str.charAt(str.length() - 1)).append(count);
	
		return result.toString();
	}*/

}

//Check two strings Anagram or not
//Binary Search
// Print all permutations of string in Java
//check whether the given input string is a palindrome
//check String object condition
//Given a string find out duplicate character and its count 
//Fibonacci Series
//Find second largest number in an array?
//Rotates the array to the right by n positions.
//Move all 1s in an array to the right/left
//To sort an array containing only 0s, 1s, and 2s
//  find the k-th non-repeating character in a string 
//Replace spaces with %20
//  find all lowercase characters in a string and convert them to uppercase
// Count number of binary strings without consecutive 1’s
//Find the factorial of a number using recursion.
//Find the median of one sorted arrays
/*Input: 
 * 	a[] = {1, 4, 7, 8, 10}
		b[] = {2, 3, 9}
	Output:
		a[] = {1, 2, 3, 4, 7}
		b[] = {8, 9, 10}*/
// i/o : aabbbccc4  o/p : a2b3c4
//
//
//

/*
Reverse a linked list.
2. Find the middle element of a linked list.
3. Implement a stack using arrays/linked list.
4. Implement a queue using arrays/linked list.
8. Implement merge sort.
9. Implement quick sort.
10. Detect a cycle in a linked list.
11. Find the intersection point of two linked lists.
12. Check if a binary tree is a binary search tree (BST).
13. Print all leaf nodes of a binary tree.
14. Reverse a binary tree.
15. Find the height of a binary tree.
16. Implement depth-first search (DFS) on a graph.
17. Implement breadth-first search (BFS) on a graph.
18. Check if a graph is connected.
23. Find the longest increasing subsequence of an array.
30. .
35. Implement an LRU (Least Recently Used) Cache.
36. Find the longest palindrome substring in a string.
*/