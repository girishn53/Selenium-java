//This class sorts the map by the values stored in it 
//It sorts the map on the basis of descending values

package collections.map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class SortingMapbyValues {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<String, Integer>();
		LinkedHashMap<String, Integer> sortedHMap = new LinkedHashMap<String, Integer>();

		ArrayList<Integer> al = new ArrayList<Integer>();

		map.put("Neha", 90);
		map.put("Lilly", 84);
		map.put("Yue Cha", 79);

		map.put("Anna", 85);
		map.put("Ani", 100);

		for (Entry<String, Integer> e : map.entrySet()) {
			al.add(e.getValue());

		}

		Collections.sort(al, Collections.reverseOrder());

		for (Integer num : al) {
			for (Entry<String, Integer> e : map.entrySet()) {

				if (e.getValue() == num) {
					sortedHMap.put(e.getKey(), num);
				}
			}

		}

		System.out.println(sortedHMap);

	}

}
