package stringPractice;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class CountCharsUsingMap {

	public static void main(String[] args) {
		String S = "Sasshhhhii is a good";



		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		char ch[] = S.toCharArray();

		for (char c : ch) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);

			}

			else

			{
				map.put(c, 1);
			}

		}

		for (Entry<Character, Integer> e : map.entrySet()) {

			System.out.println(e.getKey() + " " + e.getValue());

		}

	}

}
