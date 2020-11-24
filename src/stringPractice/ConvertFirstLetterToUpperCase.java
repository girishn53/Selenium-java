package stringPractice;

import java.util.Scanner;

public class ConvertFirstLetterToUpperCase {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter a string ");

		String sa = s.nextLine();

		s.close();

		firstToUpper(sa);

	}

	public static void firstToUpper(String inputString) {

		String words[] = inputString.split("\\s+");

		for (String word : words) {
			char ch = word.charAt(0);

			StringBuilder sb = new StringBuilder();
			if (Character.isLowerCase(ch))

			{
			char c=	 Character.toUpperCase(ch);

				sb.append(Character.toString(c)).append(word.substring(1));
			}

			else {
				sb.append(word.substring(0));

			}

			sb.append(" ");
			
			System.out.print(sb);

		}

	}

}
