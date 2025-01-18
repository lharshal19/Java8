import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamPrograms {

	public static void main(String[] args) {

		String str = "harshal";
		Map<Character, Long> collect = str.chars().mapToObj(ch -> Character.valueOf((char) ch))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(collect);

		Map<Character, Integer> collect11 = str.chars().mapToObj(ch -> Character.valueOf((char) ch)).collect(Collectors
				.groupingBy(Function.identity(), Collectors.collectingAndThen(Collectors.counting(), Long::intValue)));
		System.out.println(collect11);
		List<Entry<Character, Long>> collect2 = collect.entrySet().stream().sorted(Map.Entry.comparingByValue())
				.collect(Collectors.toList());
		System.out.println(collect2);

		String str1 = "this is java program";
		List<String> collect3 = Arrays.stream(str1.split("\\s")).collect(Collectors.toList());

		Map<String, Long> collect4 = collect3.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(collect4);
		Iterator<String> iterator = collect4.keySet().iterator();
		while (iterator.hasNext()) {
			String next = iterator.next();
			if (next.equals("is")) {
				//collect4.remove("is");
			}
		}
		System.out.println(collect4);

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		Integer reduce = list.stream().reduce(0, Integer::sum);
		System.out.println(reduce);
		OptionalInt max = list.stream().mapToInt(i -> Integer.valueOf(i)).max();
		OptionalDouble average = list.stream().mapToInt(i -> Integer.valueOf(i)).average();
		Optional<Integer> max2 = list.stream().max(Integer::compareTo);
		Optional<Integer> max3 = list.stream().max(Integer::compare);
		System.out.println(max.getAsInt());
		System.out.println(max2.get());
		System.out.println(max3.get());

	}

	//=================================
	//Sort a list of strings by length
	/*public static void main(String[] args) {
		List<String> strings = List.of("apple", "banana", "kiwi", "blueberry", "pear");
	
		// Sort the strings by length
		List<String> sortedByLength = strings.stream().sorted((s1, s2) -> Integer.compare(s1.length(), s2.length()))
				.collect(Collectors.toList());
	
		System.out.println(sortedByLength);
	}*/

	//==================================
	//Partition a list of integers into even and odd numbers.
	/*public static void main(String[] args) {
	        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
	
	        Map<Boolean, List<Integer>> partitioned = numbers.stream()
	            .collect(Collectors.partitioningBy(num -> num % 2 == 0));
	
	        List<Integer> evenNumbers = partitioned.get(true);
	        List<Integer> oddNumbers = partitioned.get(false);
	
	        System.out.println("Even Numbers: " + evenNumbers);
	        System.out.println("Odd Numbers: " + oddNumbers);
	    }*/

	//============================
	//Find the longest string in a list.
	/*public static void main(String[] args) {
	    List<String> strings = List.of("apple", "banana", "cherry", "watermelon");
	
	    Optional<String> longestString = strings.stream()
	        .max((str1, str2) -> Integer.compare(str1.length(), str2.length()));
	
	    System.out.println(longestString.orElse("No strings in the list"));
	}*/

	//=============================
	//Merge two lists of integers into one list without duplicates
	/*public static void main(String[] args) {
	       List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
	       List<Integer> list2 = Arrays.asList(4, 5, 6, 7, 8);
	
	       // Merging two lists and removing duplicates
	       List<Integer> mergedList = Stream.concat(list1.stream(), list2.stream())
	           .distinct()
	           .collect(Collectors.toList());
	
	       System.out.println(mergedList);
	   }*/

	//=============================
	//FlatMap a list of lists into a single list
	/*public static void main(String[] args) {
	      List<List<Integer>> listOfLists = Arrays.asList(
	          Arrays.asList(1, 2, 3),
	          Arrays.asList(4, 5),
	          Arrays.asList(6, 7, 8, 9)
	      );
	
	      List<Integer> flatList = listOfLists.stream()
	          .flatMap(List::stream)
	          .collect(Collectors.toList());
	
	      System.out.println(flatList);
	  }*/
	
	//===============================
	//Generate a list of the first 10 Fibonacci numbers.
	/* public static void main(String[] args) {
	       // Generate the first 10 Fibonacci numbers
	       int n = 10;
	       IntStream.range(0, n)
	           .map(Fibonacci::fibonacci)
	           .forEach(System.out::println);
	   }
	
	   // Function to calculate Fibonacci number
	   public static int fibonacci(int n) {
	       if (n <= 1) {
	           return n;
	       }
	       return fibonacci(n - 1) + fibonacci(n - 2);
	   }*/
	
	//================================
	//Find all prime numbers in a range using streams.
	/*  public static void main(String[] args) {
	        int start = 10;
	        int end = 50;
	
	        List<Integer> primeNumbers = IntStream.rangeClosed(start, end)
	            .filter(PrimeNumbersInRange::isPrime)
	            .boxed()
	            .collect(Collectors.toList());
	
	        System.out.println(primeNumbers);
	    }
	
	    public static boolean isPrime(int number) {
	        if (number <= 1) {
	            return false;
	        }
	        if (number <= 3) {
	            return true;
	        }
	        if (number % 2 == 0 || number % 3 == 0) {
	            return false;
	        }
	        for (int i = 5; i * i <= number; i += 6) {
	            if (number % i == 0 || number % (i + 2) == 0) {
	                return false;
	            }
	        }
	        return true;
	    }*/
	
	
}

//Sort a list of strings by length
//Partition a list of integers into even and odd numbers.
//Find the longest string in a list.
//Merge two lists of integers into one list without duplicates
//FlatMap a list of lists into a single list
//Generate a list of the first 10 Fibonacci numbers.
//Find all prime numbers in a range using streams.
//
//
//
//
//