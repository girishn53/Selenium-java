//getOrDefault method in map will check if value is present against the key
//will return that value
//else it will return the value present in function

package collections.map;

import java.util.HashMap;

public class MapgetOrDefault {

	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("a", 200);
		map.put("b", 300);
		map.put("c", 400);
		map.put("d", 200);

		System.out.println(map.toString());
		// this will return 200 as key "a" is already present

		int k = map.getOrDefault("a", 500);

		System.out.println(k);

		k = map.getOrDefault("e", 500);
		// this will return 500 as key "e" value is not present
		System.out.println(k);
	}

}
