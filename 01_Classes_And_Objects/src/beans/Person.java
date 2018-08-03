package beans;

public class Person {

	String firstName;
	String lastName;
	int age;

	// Default constructor
	public Person() {
		
		firstName = "Amit";
		lastName = "Patil";
		age = 25;
	}

	public void displayPerson() {

		System.out.println(firstName + " " + lastName + " - " + age);
	}

	public static void main(String[] args) {

		Person person = new Person();
		person.displayPerson();
	}
}