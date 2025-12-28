import java.util.Map.Entry;
import java.util.Objects;
import java.util.stream.Stream;

public class DSAProgram02<K, V> {

	// Create Immutable class
	/*public static void main(String[] args) {
	
		List<String> addr = new ArrayList<String>();
		addr.add("mumbai");
		addr.add("pune");
	
		Employee employee = new Employee(0, new Date(), addr);
		System.out.println(employee.hashCode());
		addr.add("nagpur");
		System.out.println(employee.hashCode());
		employee.getDob().setTime(1);
	
		System.out.println(employee);
	}
	}
	
	final class Employee {
	private final int id;
	private final Date dob;
	private final List<String> addr;
	
	public Employee(int id, Date dob, List<String> addr) {
		this.id = id;
		this.dob = new Date();
		this.addr = Collections.unmodifiableList(List.copyOf(addr));
	}
	
	public int getId() {
		return id;
	}
	
	public Date getDob() {
		return new Date(dob.getTime());
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", dob=" + dob + ", addr=" + addr + "]";
	}
	
	public List<String> getAddr() {
		return addr;
	}
	
	}*/

	//===================
	//DeadLock 
	/*public static void main(String[] args) {
		Object Ramesh_key = new Object();
		Object Suresh_key = new Object();
	
		Thread Ramesh = new Thread(() -> {
			synchronized (Suresh_key) { // t1 lock suresh
				System.out.println("Ramesh acquired Suresh_key");
				try {
					System.out.println("Ramesh sleeping for 3 sec");
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Ramesh_key woke up");
				synchronized (Ramesh_key) { // t1 wating to acquired lock once t2 release it lock
					System.out.println("Ramesh got his key");
				}
			}
		});
		Thread Suresh = new Thread(() -> {
			synchronized (Ramesh_key) { // t2 lock ramesh
				System.out.println("Suresh acquired Ramesh_key");
				try {
					System.out.println("Suresh sleeping for 3 sec");
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Suresh_key woke up");
				synchronized (Suresh_key) { // t2 waiting to acquired lock once t1 release it lock
					System.out.println("Suresh got his key");
				}
			}
		});
		Ramesh.start();
		Suresh.start();
	}*/

	//==========================
	//T1 prints 1, T2 prints 2, T1 prints 3, T2 prints 4 and so on till 10
	/*private final Object lock = new Object();
	private boolean isT1Turn = true; // T1 starts first
	
	public void printOdd() {
		for (int i = 1; i <= 10; i += 2) {
			synchronized (lock) {
				while (!isT1Turn) {
					try {
						lock.wait();
					} catch (InterruptedException e) {
						Thread.currentThread().interrupt();
					}
				}
				System.out.println("T1: " + i);
				isT1Turn = false;
				lock.notify();
			}
		}
	}
	
	public void printEven() {
		for (int i = 2; i <= 10; i += 2) {
			synchronized (lock) {
				while (isT1Turn) {
					try {
						lock.wait();
					} catch (InterruptedException e) {
						Thread.currentThread().interrupt();
					}
				}
				System.out.println("T2: " + i);
				isT1Turn = true;
				lock.notify();
			}
		}
	}
	
	public static void main(String[] args) {
		DSAProgram02 ap = new DSAProgram02();
	
		Thread t1 = new Thread(ap::printOdd);
		Thread t2 = new Thread(ap::printEven);
	
		t1.start();
		t2.start();
	}
	*/
	//=====================
	/*	Write an SQL query to print names of all the employees whose salary greater than or equal to the employee with first name â€œRitaâ€�.
		Employee table â€” Column Names : Eid, Fname, Lname, Email . 
		Salaries table â€” Column Names : Eid, Salary
	
		=> SELECT e.Fname, e.Lname FROM Employee e
		JOIN Salaries s ON e.Eid = s.Eid	WHERE s.Salary >= (SELECT s2.Salary FROM Employee e2
		    JOIN Salaries s2 ON e2.Eid = s2.Eid WHERE e2.Fname = 'Rita');
		*/

	//==========================================

	// Default initial capacity and load factor
	/*private static final int INITIAL_CAPACITY = 16;
	private static final float LOAD_FACTOR = 0.75f;
	// Entry array (buckets) and size tracker
	private Entry<K, V>[] buckets;
	private int size = 0;
	
	// Constructor
	public DSAProgram02() {
		buckets = new Entry[INITIAL_CAPACITY];
	}
	
	// Node structure for HashMap (key-value pair)
	static class Entry<K, V> {
		K key;
		V value;
		Entry<K, V> next; // Linked list for collision resolution
	
		Entry(K key, V value) {
			this.key = key;
			this.value = value;
		}
	}
	
	// Put method
	public void put(K key, V value) {
		int index = getBucketIndex(key);
		Entry<K, V> head = buckets[index];
	
		// Check if the key already exists in the linked list
		while (head != null) {
			if (Objects.equals(head.key, key)) {
				head.value = value; // Update value for the key
				return;
			}
			head = head.next;
		}
	
		// Key not found, insert a new entry at the head of the bucket
		Entry<K, V> newEntry = new Entry<>(key, value);
		newEntry.next = buckets[index];
		buckets[index] = newEntry;
		size++;
	
		// Check and resize if the load factor is exceeded
		if ((float) size / buckets.length > LOAD_FACTOR) {
			resize();
		}
	}
	
	// Get method
	public V get(K key) {
		int index = getBucketIndex(key);
		Entry<K, V> head = buckets[index];
	
		// Traverse the linked list in the bucket
		while (head != null) {
			if (Objects.equals(head.key, key)) {
				return head.value;
			}
			head = head.next;
		}
		return null; // Key not found
	}
	// Hash function to compute bucket index
	private int getBucketIndex(K key) {
		return (key == null) ? 0 : Math.abs(key.hashCode()) % buckets.length;
	}
	// Resize the HashMap when load factor is exceeded
	private void resize() {
		Entry<K, V>[] oldBuckets = buckets;
		buckets = new Entry[oldBuckets.length * 2]; // Double the capacity
		size = 0;
	
		// Rehash all the entries into the new bucket array
		for (Entry<K, V> head : oldBuckets) {
			while (head != null) {
				put(head.key, head.value);
				head = head.next;
			}
		}
	}
	
	// Get the size of the HashMap
	public int size() {
		return size;
	}
	
	// Main method for testing
	public static void main(String[] args) {
		DSAProgram02<String, Integer> map = new DSAProgram02<String, Integer>();
		map.put("one", 1);
		map.put("two", 2);
		map.put("three", 3);
	
		System.out.println("Value for 'one': " + map.get("one")); // Output: 1
		System.out.println("Value for 'two': " + map.get("two")); // Output: 2
		System.out.println("Value for 'three': " + map.get("three")); // Output: 3
	
		map.put("one", 10); // Update value for key 'one'
		System.out.println("Updated value for 'one': " + map.get("one")); // Output: 10
	
		System.out.println("Size: " + map.size()); // Output: 3
	}*/

	//============================================

	/*
	public static void main(String[] args) {

		Stream.iterate(new int[] { 11, 1 }, a -> new int[] { a[0] + a[1], a[1] + 2 }).limit(5).map(a -> a[0])
				.forEach(n -> System.out.print(n + ", "));
	}
	*/
	
	//===============================================
			
			
	
}

//Create Immutable class
//Deadlock
//T1 prints 1, T2 prints 2, T1 prints 3, T2 prints 4 and so on till 10
/*Write an SQL query to print names of all the employees whose salary greater than or equal to the employee with first name â€œRitaâ€�.
Employee table â€” Column Names : Eid, Fname, Lname, Email . 
Salaries table â€” Column Names : Eid, Salary*/
//How to create a custom HashMap class with get and put method implementations?
/*Print the series using Java 8 only
	11, 12, 15, 20, 27 */
//
//
//
//
//
