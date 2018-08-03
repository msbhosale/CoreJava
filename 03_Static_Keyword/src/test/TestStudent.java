package test;

import beans.Student;

public class TestStudent {

	public static void main(String[] args) {

		Student student = new Student(101, "Harsh");
		Student student2 = new Student(102, "Jay");

		System.out.println(student);
		System.out.println(student2);
	}
}