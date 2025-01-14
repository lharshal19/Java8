import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class DSAProgram02 {

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
	
	
	
}

//Create Immutable class
//Deadlock
//
//
//
//
