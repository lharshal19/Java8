package collectMethods.averagingInt2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import streamMethods.Student;

public class Examplae2 {

	public static void main(String[] args) {

		Double output = getListOfStudents().stream().collect(Collectors.averagingInt(x ->x.getAge()));
		
		System.out.println(output.intValue());
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
