package collections.map;

import java.util.HashMap;
import java.util.Map;

public class FindFirstNonRepeatCharInString {

	public static void main(String[] args) {

		String s = "Swiss";
		s = s.toLowerCase();

		findfirstnonRepeat(s);
	}

	static void findfirstnonRepeat(String str) {

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			map.put(ch, map.getOrDefault(ch, 0) + 1);

		}

		System.out.println(map.toString());

		for (char ch : str.toCharArray()) {

			if (map.get(ch) == 1) {
				System.out.println(ch);
				break;
			}
		}
	}
}
