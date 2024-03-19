package collections.map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class SortingMapAlphabetically {

	public static void main(String[] args) {

		HashMap<String, String> map = new HashMap<String, String>();

		LinkedHashMap<String, String> sortedMap = new LinkedHashMap<String, String>();

		ArrayList<String> al = new ArrayList<String>();

		map.put("2", "B");
		map.put("8", "A");
		map.put("4", "D");
		map.put("7", "F");
		map.put("6", "W");
		map.put("19", "J");
		map.put("1", "Z");

		for (Entry<String, String> e : map.entrySet()) {

			al.add(e.getValue());

		}

		// Custom comparator can be used as below

//		Comparator<String> cm = new Comparator<String>() {
//
//			@Override
//			public int compare(String o1, String o2) {
////				System.out.println("In comparator");
////				System.out.println(o1.compareTo(o2));
//				return o1.compareTo(o2);
//			}
//		};

		// or

		// Can be sorted by Collections class

		Collections.sort(al);

		for (String s : al) {

			for (Entry<String, String> e : map.entrySet()) {

				if (e.getValue().equals(s)) {
				sortedMap.put(e.getKey(), s);
				}

			}

		}
		
		System.out.println(sortedMap);
	}

}
