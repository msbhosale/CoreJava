package edu.ms.test;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {

		int numbers[] 		= { 12, 17, 19, 23, 63, 69, 78, 88, 99, 127 };
		int arraySize		= 0;

		for (int number : numbers) {
			System.out.print(number + " ");
			arraySize++;
		}
		
		Scanner scanner 	= new Scanner(System.in);
		System.out.println("\nWhich number you want to search : ");

		int numberToSearch 	= scanner.nextInt();		

		int lowerLimit 		= 0;
		int upperLimit 		= arraySize - 1;
		int middlePoint;

		while (lowerLimit <= upperLimit) {

			middlePoint = (lowerLimit + upperLimit) / 2;

			if (numberToSearch == numbers[middlePoint]) {

				System.out.println("Number found at " + (middlePoint + 1));
				return;

			} else if (numberToSearch > numbers[middlePoint]) {

				lowerLimit = middlePoint + 1;

			} else {

				upperLimit = middlePoint - 1;

			}
		}
		
		System.out.println("Number not found");
	}
}