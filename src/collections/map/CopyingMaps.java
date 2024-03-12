//TreeMap maintains insertion order
//It maintains on the basis of keys

package collections.map;

import java.util.HashMap;
import java.util.TreeMap;

public class CopyingMaps {

	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap<String, Integer>();

		map.put("Girish", 34);
		map.put("Ankita", 30);
		map.put("Rashi", 3);

		System.out.println(map);
		
		
		TreeMap<String, Integer> tm = new TreeMap<String, Integer>();
		
		tm.putAll(map);
		
		System.out.println(tm);

	}

}
