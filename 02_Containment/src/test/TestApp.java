package test;

import beans.Date;
import beans.Person;

public class TestApp {

	public static void main(String[] args) {

		Person person = new Person("Ajay", "Jadhav", new Date(12, 7, 1995));
		Person person2 = new Person("Sayali", "Shinde", new Date(31, 7, 1999));

		System.out.println(person);
		System.out.println(person2);
	}
}