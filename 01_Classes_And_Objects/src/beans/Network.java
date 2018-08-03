package beans;

public class Network {

	// To access by Class name, declared as 'static'
	private static Network network = new Network();

	// Private constructor
	private Network() {

	}

	public static Network getInstance() {

		return network;
	}

	// Sample method
	public void connect() {

		System.out.println("Sample method of the Network class");
	}
}