package collectMethods.groupBy4.groupingByConcurrent;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentMap;
import java.util.function.Function;
import java.util.stream.Collectors;

import streamMethods.Student;

public class Example4 {

	static Function<Student, Integer> function = (a) -> a.getAge();

	public static void main(String[] args) {
		List<Student> list = Student.getListOfStudents();

		ConcurrentMap<Object, Long> output = list.stream()
				.collect(Collectors.groupingByConcurrent(a -> a.getAge(), Collectors.counting()));

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
