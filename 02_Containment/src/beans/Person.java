package beans;

public class Person {

	String firstName;
	String lastName;
	Date birthDate;// Object of Date class can be part of this class

	public Person(String firstName, String lastName, Date birthDate) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName
				+ ", birthDate=" + birthDate + "]";
	}
}