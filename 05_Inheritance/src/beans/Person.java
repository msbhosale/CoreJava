package beans;

public class Person {

	String firstName;
	String lastName;

	public Person(String firstName, String lastName) {

		this.firstName = firstName;
		this.lastName = lastName;
	}

	public void breathe() {
		System.out.println("Can breathe");
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName
				+ "]";
	}
}