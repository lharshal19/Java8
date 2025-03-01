package streamMethods.forEachOrdered17;

import java.util.List;

import streamMethods.Student;

public class Example2 {

	public static void main(String[] args) {
		
		List<Student> list = Student.getListOfStudents();

		list.stream().parallel().forEach( x -> System.out.println(x.getAge())); 

		System.out.println("-------");
		
		list.stream().parallel().forEachOrdered(x -> System.out.println(x.getAge()));
	}

}
