package collections.map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class SortMapByValuesinDescOrderUsingStream {

	public static void main(String[] args) {

		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("Girish", 101);
		hm.put("Ankita", 103);
		hm.put("Rashi", 105);

		hm.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
				.forEach(System.out::println);

	}

}
