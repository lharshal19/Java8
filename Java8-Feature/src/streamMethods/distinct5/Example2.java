package streamMethods.distinct5;

import streamMethods.Student;

public class Example2 {

	public static void main(String[] args) {

		Student.getListOfStudents().stream().forEach(x -> {
			System.out.println(x.getName()+" "+x.getAge());
		});
		
		System.out.println("----");
		Student.getListOfStudents().stream().distinct().forEach(x -> {
			System.out.println(x.getName()+ " "+x.getAge());
		});
	}

}
