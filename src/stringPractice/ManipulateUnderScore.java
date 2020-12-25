//Program to get output =hello_world

package stringPractice;

public class ManipulateUnderScore {

	public static void main(String[] args) {

		String actualString = "HelloWorld";

		String updatedString = "";

		int pos = 0;

		String finalString = "";

		char ch = actualString.charAt(0);

		if (Character.isUpperCase(ch)) {

			ch = Character.toLowerCase(ch);

			updatedString = Character.toString(ch) + actualString.substring(1);

		}

		System.out.println(updatedString);

		char c[] = updatedString.toCharArray();

		for (int i = 0; i < c.length; i++) {
			if (Character.isUpperCase(c[i])) {

				pos = i;

				break;
			}

		}

		System.out.println("Position on which upper case is found " + pos);

		String part1 = updatedString.substring(0, 5);

		String part2 = actualString.substring(pos).toLowerCase();

		finalString = part1 + "_" + part2;

		System.out.println(finalString);

	}

}
