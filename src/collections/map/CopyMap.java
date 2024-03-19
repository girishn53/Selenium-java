package collections.map;

import java.util.HashMap;
import java.util.TreeMap;

public class CopyMap {

	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap<String, Integer>();

		TreeMap<String, Integer> tm = new TreeMap<String, Integer>();

		map.put("One", 1);
		map.put("Two", 2);
		map.put("Three", 3);

		HashMap<String, Integer> map1 = new HashMap<String, Integer>();

		map1.put("Four", 4);
		map1.put("Five", 5);

		map.putAll(map1);

		map.putIfAbsent("One", 1);
		map.putIfAbsent("Six", 6);

		System.out.println(map);
		tm.putAll(map);

		// sorted map in asc order

		System.out.println(tm);

	}

}
