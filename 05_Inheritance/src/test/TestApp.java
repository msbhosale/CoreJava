package test;

import beans.Student;

public class TestApp {

	public static void main(String[] args) {

		Student student = new Student("Ajay", "Patil", 101);
		System.out.println(student);
		student.breathe();
	}
}