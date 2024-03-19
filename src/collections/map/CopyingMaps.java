//TreeMap maintains ascending order
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

		System.out.println("order of keys in non-alphabetic /not asc order ");
		System.out.println(map);
		
		
		TreeMap<String, Integer> tm = new TreeMap<String, Integer>();
		
		tm.putAll(map);
		//It prints in asc order based on keys if String it is in alphabetic
		System.out.println(tm);

	}

}
