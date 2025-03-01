package collectMethods.groupBy4.groupingBy;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import streamMethods.Student;
public class Example5 {

	static Function<Student, Integer> function = (a) ->a.getAge();
	public static void main(String[] args) {
		
		List<Student> list = Student.getListOfStudents();
	

		Map<String, Long> output = list.stream() // Stream<STudent>
				.collect(Collectors.groupingBy(a ->a.getName(), Collectors.counting()));

		System.out.println(output);

	}
	
	public static List<Student> getListOfStudents() {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student("Test1", 40));
		list.add(new Student("Test5", 50));
		list.add(new Student("Test3", 30));
		list.add(new Student("Test2", 20));
		list.add(new Student("Test4", 10));
		list.add(new Student("Test4", 10));
		list.add(new Student("Test4", 10));
		return list;
	}


}
