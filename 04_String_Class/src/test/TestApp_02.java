package test;

/*
 * Some methods of String class
 * 
 */

public class TestApp_02 {

	public static void main(String[] args) {

		String phrase = "This is a sample phrase";

		char ch = phrase.charAt(1);// Returns the char at given position
		System.out.println(ch);

		int index = phrase.indexOf("is");// First occurrence of given pattern
		System.out.println(index);

		int length = phrase.length();// Returns the length of a String
		System.out.println(length);

		char[] letters = phrase.toCharArray();// Returns array of characters
		System.out.println(letters);

		String[] words = phrase.split(" ");// Returns array of Strings,
											// splitting existing String by a
											// given pattern
		for (String word : words) {

			System.out.println(word);
		}
	}
}