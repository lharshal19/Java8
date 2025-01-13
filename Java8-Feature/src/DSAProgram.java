import java.util.HashMap;
import java.util.Map;

public class DSAProgram {

	//Check two strings Anagram or not
	/*	public static void main(String[] args) {
	
			String str1 = "Bored";
			String str2 = "Robed";
	
			str1 = str1.toLowerCase();
			str2 = str2.toLowerCase();
	
			if (str1.length() == str2.length()) {
				char[] str1charArray = str1.toCharArray();
				char[] str2charArray = str2.toCharArray();
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
	/*	public static void main(String[] args) {
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
	public static void main(String[] args) {
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
	}

}

//Check two strings Anagram or not
//Binary Search
// Print all permutations of string in Java
//check whether the given input string is a palindrome
//check String object condition
//Given a string find out duplicate character and its count 
