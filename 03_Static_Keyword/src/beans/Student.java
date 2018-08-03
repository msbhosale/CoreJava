package beans;

public class Student {

	public static final String COLLEGE_NAME = "New College";

	int rollNumber;
	String name;

	public Student(int rollNumber, String name) {

		this.rollNumber = rollNumber;
		this.name = name;
	}

	@Override
	public String toString() {
		return rollNumber + "\t" + name + "\t" + COLLEGE_NAME;
	}

}