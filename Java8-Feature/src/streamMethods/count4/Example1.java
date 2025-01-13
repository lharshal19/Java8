package streamMethods.count4;

import java.util.List;

import streamMethods.Student;

public class Example1 {

	public static void main(String[] args) {

		List<Student> list = Student.getListOfStudents();
		

		System.out.println(list.stream().count());

		System.out.println(list.stream().filter(x -> x.getAge() > 40).count());

		System.out.println(list.stream().filter(x -> x.getName().contains("t") && x.getAge() > 40).count());

	}

}
