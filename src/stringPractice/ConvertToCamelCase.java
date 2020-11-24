package stringPractice;

import java.util.Scanner;

public class ConvertToCamelCase {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Please enter a string ");

		String sa = s.nextLine();

		s.close();

		toCamelCase(sa);

	}

	public static void toCamelCase(String inputString) {
		// hello Girish
		String words[] = inputString.split("\\s+");

		StringBuilder sb = new StringBuilder();

		for (String word : words) {

			char c = word.charAt(0);

			if (!Character.isUpperCase(c)) {

				sb.append(Character.toUpperCase(c)).append(word.substring(1));
			}

			else

			{
				sb.append(word.substring(0));
			}

		}

		String result = sb.toString().trim();

		System.out.println(result);
	}

}
