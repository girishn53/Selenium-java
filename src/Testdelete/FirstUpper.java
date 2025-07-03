package Testdelete;

import java.util.Scanner;

public class FirstUpper {

	public static void main(String[] args) {

		String s = "";

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter the string");

		s = sc.nextLine();

		sc.close();

		// System.out.println("The entered string is "+s);

		convertFirstToUpper(s);
	}

	public static void convertFirstToUpper(String s) {

		String finalStr = s;

		String str[] = finalStr.split("\\s+");

		StringBuffer sb = new StringBuffer();
		for (String sa : str) {

			char ch = sa.charAt(0);

			if (Character.isLowerCase(ch)) {

				ch = Character.toUpperCase(ch);

				sb.append(Character.toString(ch)).append(sa.substring(1));
			}

			else {

				sb.append(sa.substring(0));
			}

		}

		System.out.println("The converted string is" + sb);
	}

}
