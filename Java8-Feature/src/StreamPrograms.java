import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamPrograms {

	/*public static void main(String[] args) {
	
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
	
	}*/

	//=================================
	//Sort a list of strings by length
	/*public static void main(String[] args) {
		List<String> strings = List.of("apple", "banana", "kiwi", "blueberry", "pear");
	
		// Sort the strings by length
		List<String> sortedByLength = strings.stream().sorted((s1, s2) -> Integer.compare(s1.length(), s2.length()))
				.collect(Collectors.toList());
	
		System.out.println(sortedByLength);
		List<String> sortedByLength1 = strings.stream().sorted(Comparator.comparingInt(String::length)).collect(Collectors.toList());
		System.out.println(sortedByLength1);
		
		List<String> list = Arrays.asList("apple", "banana", "kiwi", "blueberry", "pear");
		list.sort((s1,s2)->{ return Integer.compare(s1.length(),s2.length());});
		System.out.println(list);
		
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
	         // .flatMap(i->i.stream())
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
	/*public static void main(String[] args) {
		int start = 0;
		int end = 50;
		List<Integer> primeNumbers = IntStream.rangeClosed(start, end).filter(StreamPrograms::isPrime).boxed()
				.collect(Collectors.toList());
		System.out.println(primeNumbers);
	}
	
	public static boolean isPrime(int num) {
		if (num <= 1)
			return false;
		for (int i = 2; i < num; i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}*/

	//=============================
	//Check if a given list is sorted.
	/*  public static <T extends Comparable<T>> boolean isSorted(List<T> list) {
	        return list.stream()
	                .reduce((prev, current) -> current.compareTo(prev) >= 0 ? current : null)
	                .isPresent();
	    }
	
	    public static void main(String[] args) {
	        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
	        System.out.println(isSorted(numbers)); // Output: true
	
	        List<Integer> unsortedNumbers = List.of(5, 3, 4, 1, 2);
	        System.out.println(isSorted(unsortedNumbers)); // Output: false
	    }*/

	//=================================
	//Find the intersection of two lists.
	/* public static void main(String[] args) {
	        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
	        List<Integer> list2 = Arrays.asList(3, 4, 5, 6, 7);
	
	        List<Integer> intersection = list1.stream()
	            .filter(list2::contains)
	            .collect(Collectors.toList());
	
	        System.out.println(intersection);
	    }*/

	//============================

	//Check if two lists are disjoint using streams.
	/* public static void main(String[] args) {
	       List<Integer> list1 = List.of(1, 2, 3, 4, 5);
	       List<Integer> list2 = List.of(6, 7, 8, 9, 10);
	
	       boolean areDisjoint = list1.stream()
	           .noneMatch(list2::contains);
	
	       System.out.println("Are the lists disjoint? " + areDisjoint);
	   }*/

	//=============================
	//Implement a pipeline to process a list of integers: square, filter evens, and sum.
	/* public static void main(String[] args) {
	        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
	
	        int result = numbers.stream()
	            .map(n -> n * n)            // Step 1: Square each integer
	            .filter(n -> n % 2 == 0)     // Step 2: Filter even squares
	            .reduce(0, Integer::sum);    // Step 3: Sum the even squares
	
	        System.out.println("Sum of even squares: " + result);
	    }*/

	//==============================
	//Collecting Data to Map with Multiple Values
	/*public static void main(String[] args) {
		List<Student> students = Arrays.asList(new Student("John", 85), new Student("Jane", 90),
				new Student("John", 88));
	
		Map<String, List<Integer>> map = students.stream().collect(
				Collectors.groupingBy(Student::getName, Collectors.mapping(Student::getAge, Collectors.toList())));
		System.out.println(map);
	
		List<String> strings = Arrays.asList("apple", "apricot", "banana", "blueberry");
		Map<Character, List<String>> map1 = strings.stream().collect(Collectors.groupingBy(s -> s.charAt(0)));
		System.out.println(map1);
	
	}*/

	//====================

	/*public static void main(String[] args) {
	
		List<Employee> employees = Arrays.asList(new Employee("HR", 50000), new Employee("HR", 60000),
				new Employee("IT", 70000), new Employee("IT", 80000), new Employee("Finance", 75000));
	
		// Stream API to group by department and find the max salary in each department
		Map<String, Optional<Employee>> maxSalariesByDept = employees.stream().collect(Collectors
				.groupingBy(Employee::getName, Collectors.maxBy(Comparator.comparingDouble(Employee::getAge))));
		System.out.println(maxSalariesByDept);
		maxSalariesByDept.values().forEach(System.out::println);
		maxSalariesByDept.keySet().forEach(System.out::println);
		maxSalariesByDept.entrySet().stream().forEach(i -> System.out.println(i.getKey() + "-- " + i.getValue())); // forEach(System.out::println);;
	
		System.out.println("--------------");
		Map<String, Double> collect = employees.stream().collect(Collectors
				.groupingBy(Employee::getName, Collectors.averagingDouble(Employee::getAge)));
		System.out.println(collect);
		
		System.out.println("--------------");
		
		
		
	}*/

	//=======================
	//find the largest number in an array of integers that does not have any duplicates
	/*public static void main(String[] args) {
		int[] nums = { 4, 5, 10, 10 };
		Map<Integer, Long> frequencyMap = Arrays.stream(nums).boxed()
				.collect(Collectors.groupingBy(num -> num, Collectors.counting()));
	
		// Find the maximum number with frequency 1
		Integer orElse = frequencyMap.entrySet().stream().filter(entry -> entry.getValue() == 1).map(Map.Entry::getKey)
				.max(Integer::compareTo).orElse(-1);
		System.out.println(orElse);
		System.out.println("------------");
		//method 2
		TreeMap<Integer, Integer> treeMap = new TreeMap<>();
		for (int num : nums) {
			treeMap.put(num, treeMap.getOrDefault(num, 0) + 1);
		}
	
		// Traverse TreeMap in descending order
		for (int num : treeMap.descendingKeySet()) {
			if (treeMap.get(num) == 1) {
				System.out.println(num);
				break;
			}
		}
		System.out.println("------------");
	
		// Find the largest number with frequency 1
		int largestUnique =0;
		for (int num : nums) {
			if (frequencyMap.get(num) == 1 && num > largestUnique) {
				largestUnique = num;
			}
		}
	
		System.out.println(largestUnique ==0 ? -1 : largestUnique);
	
	}*/

	//===========================================
	/*public static void main(String[] args) {
	
		Map<String, Employee> map = new HashMap<String, Employee>();
		map.put("a1", new Employee(101, "Ramesh", 10000));
		map.put("b1", new Employee(102, "Ramesh", 20000));
		map.put("c1", new Employee(103, "Rajesh", 30000));
	
		//used filter and map
		List<Double> collect = map.entrySet().stream().filter(i -> i.getValue().getName().equalsIgnoreCase("Ramesh"))
				.map(i -> i.getValue().getSalary()).collect(Collectors.toList());
		System.out.println(collect);
	
		List<Double> collect3 = map.entrySet().stream().filter(i -> i.getValue().getName().equalsIgnoreCase("Ramesh"))
				.mapToDouble(i -> i.getValue().getSalary()).boxed().collect(Collectors.toList());
		System.out.println(collect3);
	
		List<Double> collect2 = map.values().stream().filter(i -> i.getName().equalsIgnoreCase("Ramesh"))
				.map(Employee::getSalary).collect(Collectors.toList());
		System.out.println(collect2);
	
		List<Integer> collect4 = map.entrySet().stream().filter(i -> i.getValue().getName().equalsIgnoreCase("Ramesh"))
				.mapToInt(i -> (int) i.getValue().getSalary()).boxed().collect(Collectors.toList());
		System.out.println(collect4);
	
		//create unmodifiable list - Convert the List to an Immutable List
		List<Double> salaries = map.entrySet().stream().filter(i -> i.getValue().getName().equalsIgnoreCase("Ramesh"))
				.map(i -> i.getValue().getSalary())
				.collect(Collectors.collectingAndThen(Collectors.toList(), Collections::unmodifiableList));
	
		List<Float> collect5 = map.entrySet().stream().filter(i -> i.getValue().getName().equalsIgnoreCase("Ramesh"))
				.map(i -> i.getValue().getSalary())
				.collect(Collectors.mapping(Double::floatValue, Collectors.toList()));
		System.out.println(collect5);
		//used for loop
		List<Double> list = new ArrayList<Double>();
		for (Map.Entry<String, Employee> entry : map.entrySet()) {
			if (entry.getValue().getName().equalsIgnoreCase("Ramesh")) {
				list.add(entry.getValue().getSalary());
			}
		}
		System.out.println(list);
	
		//used foreach method
		List<Double> list1 = new ArrayList<Double>();
		map.forEach((key, value) -> {
			if (value.getName().equalsIgnoreCase("Ramesh")) {
				list1.add(value.getSalary());
			}
		});
		System.out.println(list1);
		
		
	}
	
	}
	
	class Employee {
	int id;
	String name;
	double salary;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}*/
	
	
}
//Sort a list of strings by length
//Partition a list of integers into even and odd numbers.
//Find the longest string in a list.
//Merge two lists of integers into one list without duplicates
//FlatMap a list of lists into a single list
//Generate a list of the first 10 Fibonacci numbers.
//Find all prime numbers in a range using streams.
//Check if a given list is sorted.
//Find the intersection of two lists.
//Check if two lists are disjoint using streams.
//Implement a pipeline to process a list of integers: square, filter evens, and sum.
//Collecting Data to Map with Multiple Values
//find the largest number in an array of integers that does not have any duplicates
//
//