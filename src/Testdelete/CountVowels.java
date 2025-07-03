package Testdelete;

import java.util.Scanner;

public class CountVowels {

	public static void main(String[] args) {
		String s = null;

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter a string");

		s = sc.nextLine();

		sc.close();

		findVowels(s);

	}

	public static void findVowels(String finalstr) {

		String fnlStr = finalstr.toUpperCase();
		
		while (fnlStr.length() > 1) {
			int counter = 0;
			char ch = fnlStr.charAt(0);
			

			for (int i = 0; i <fnlStr.length(); i++) {

				if (ch == fnlStr.charAt(i)) {
					counter++;
				}

			}

			if (Character.isWhitespace(ch)) {

				System.out.println("The number of whitespace is" + counter);
			}

			else if (Character.toString(ch).equalsIgnoreCase("a") || Character.toString(ch).equalsIgnoreCase("e")
					|| Character.toString(ch).equalsIgnoreCase("i") || Character.toString(ch).equalsIgnoreCase("o")
					|| Character.toString(ch).equalsIgnoreCase("u")) {

				System.out.println("The count of " + ch + " " + counter);

			}

			fnlStr = fnlStr.replace(Character.toString(ch), "");

		}

	}

}
