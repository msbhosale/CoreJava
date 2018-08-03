package beans;

public class Product {

	public static int productCount = 0;

	int id;
	String name;

	public Product(int id, String name) {

		productCount++;
		this.id = id;
		this.name = name;
	}

	public static int getProductCount() {

		return productCount;
	}
}