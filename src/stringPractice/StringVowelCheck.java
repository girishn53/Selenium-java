package stringPractice;
import java.util.Scanner;

public class StringVowelCheck {

	public static void main(String[] args) {

		System.out.println("Please enter a string ");

		Scanner sc = new Scanner(System.in);

		String inputString = sc.nextLine();

		sc.close();

		findVowels(inputString);
	}

	public static void findVowels(String inputString) {

		inputString = inputString.toUpperCase();

		while (inputString.length() > 1) {

			char ch = inputString.charAt(0);

			int counter = 0;

			for (int j = 0; j < inputString.length(); j++) {

				if (ch == inputString.charAt(j)) {
					counter++;
				}

			}

			if (Character.isWhitespace(ch)) {
				System.out.println("Count of whitespace is" + counter);
			}

			else {

				if (Character.toString(ch).equalsIgnoreCase("a") || Character.toString(ch).equalsIgnoreCase("e")
						|| Character.toString(ch).equalsIgnoreCase("i") || Character.toString(ch).equalsIgnoreCase("o")
						|| Character.toString(ch).equalsIgnoreCase("u")) {
					System.out.println("Count of character " + ch + counter);
				}
			}

			inputString = inputString.replace(Character.toString(ch), "");

		}

	}

}
