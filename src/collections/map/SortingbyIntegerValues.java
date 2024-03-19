//This program sorts the map using values in desc order
//It uses linkedHashmap
//It sorts when value is Integer type
package collections.map;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class SortingbyIntegerValues {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();

		HashMap<String, Integer> map = new HashMap<String, Integer>();

		LinkedHashMap<String, Integer> map1 = new LinkedHashMap<String, Integer>();

		map.put("Neha", 90);
		map.put("Lilly", 84);
		map.put("Cha", 79);
		map.put("Qadri", 85);
		map.put("Ani", 100);

		for (Entry<String, Integer> e : map.entrySet()) {

			al.add(e.getValue());

		}

		//It sorts in desc order
		Collections.sort(al,Collections.reverseOrder());
		System.out.println(al);

		for (Integer i : al) {

			for (Entry<String, Integer> e : map.entrySet()) {
				if (e.getValue().equals(i)) {
					map1.put(e.getKey(), i);
				}
			}

		}

		System.out.println(map1);
	}

}
