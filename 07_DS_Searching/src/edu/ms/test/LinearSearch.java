package edu.ms.test;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {

		int numbers[] 	= { 25, 16, 3, 78, 44, 51, 7, 15, 9 };
		int arraySize 	= 0;
		int position 	= 0;
		int numberToSearch;

		for (int number : numbers) {
			System.out.print(number + " ");
			arraySize++;
		}

		Scanner scanner = new Scanner(System.in);
		System.out.println("\nWhich number you want to search : ");

		numberToSearch = scanner.nextInt();

		for (int i = 0; i < arraySize; i++) {

			if (numbers[i] == numberToSearch) {
				position = i + 1;
			}
		}

		if (position == 0) {
			System.err.println("Oops !\nNumber not found");
		} else {
			System.out.println("Number found at position " + position);
		}
	}
}