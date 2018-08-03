package test;

import beans.Product;

public class TestProduct {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		Product product = new Product(21, "Key board");
		Product product2 = new Product(45, "iPod Shuffle");
		Product product3 = new Product(12, "USB cable Type-C");

		int count = Product.getProductCount();

		System.out.println("Total products are : " + count);
	}
}