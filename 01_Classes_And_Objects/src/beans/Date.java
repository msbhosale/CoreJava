package beans;

public class Date {

	int day;
	int month;
	int year;

	// Parameterized constructor
	public Date(int day, int month, int year) {

		this.day = day;
		this.month = month;
		this.year = year;
	}

	public void displayDate() {

		System.out.println(day + "/" + month + "/" + year);
	}

	public static void main(String[] args) {

		// Creating object of a class Date
		Date date = new Date(3, 8, 2018);
		date.displayDate();
	}
}