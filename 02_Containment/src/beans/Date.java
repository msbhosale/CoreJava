package beans;

public class Date {

	int day;
	int month;
	int year;

	public Date(int day, int month, int year) {

		this.day = day;
		this.month = month;
		this.year = year;
	}

	// String representation of an object
	@Override
	public String toString() {
		return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
	}
}