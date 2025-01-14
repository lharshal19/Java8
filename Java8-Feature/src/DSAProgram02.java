import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;


public class DSAProgram02 {

	// Create Immutable class
	public static void main(String[] args) {

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

}

//Create Immutable class
//
//
//
//
//

