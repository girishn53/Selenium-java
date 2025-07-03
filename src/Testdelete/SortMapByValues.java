package Testdelete;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class SortMapByValues {

	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("A", 1);
		map.put("B", 2);
		map.put("C", 3);
		map.put("D", 4);

		LinkedHashMap<String, Integer> sortedmap = new LinkedHashMap<String, Integer>();
		ArrayList<Integer> al = new ArrayList<Integer>();

		for (Entry<String, Integer> e : map.entrySet()) {
			al.add(e.getValue());

		}

		Collections.sort(al,Collections.reverseOrder());

		for (Integer i : al) {
			for (Entry<String, Integer> e1 : map.entrySet()) {

				if (i == e1.getValue()) {

					sortedmap.put(e1.getKey(), e1.getValue());
				}

			}

		}

		System.out.println("The sorted map is " + sortedmap);

	}

}
