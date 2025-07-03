package Testdelete;

public class ManipulateString {

	public static void main(String[] args) {

		String s = "HelloWorld";
		String modified = null;
		char ch = s.charAt(0);
		int pos = 0;

		if (Character.isUpperCase(ch)) {

			ch = Character.toLowerCase(ch);

			modified = Character.toString(ch) + s.substring(1);

		}

		System.out.println(modified);

		char c[] = modified.toCharArray();

		for (int i = 0; i < c.length; i++) {

			if (Character.isUpperCase(c[i])) {
				pos = i;

			}
		}

		String first = modified.substring(0, pos);

		String second = modified.substring(pos, modified.length()).toLowerCase();

		String finalStr = first + "_" + second;
		System.out.println(finalStr);

	}

}
