package beans;

public class Student extends Person {

	int rollNumber;

	public Student(String firstName, String lastName, int rollNumber) {
		super(firstName, lastName);
		this.rollNumber = rollNumber;
	}

	@Override
	public String toString() {

		return "Student [rollNumber=" + rollNumber + ", firstName=" + firstName
				+ ", lastName=" + lastName + "]";
	}
}