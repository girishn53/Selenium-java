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

		int len = words.length;

		for (int i = 0; i < len; i++) {

			char ch = words[i].charAt(0);

			if (i==0 && Character.isUpperCase(ch))

			{
				sb.append(Character.toLowerCase(ch)).append(words[i].substring(1));
			}

			else if (i>0&&Character.isLowerCase(ch)) {
				
				sb.append(Character.toUpperCase(ch)).append(words[i].substring(1));

			}
			
			else

				sb.append(words[i].substring(0));
		}

		System.out.println(sb);
	}
}