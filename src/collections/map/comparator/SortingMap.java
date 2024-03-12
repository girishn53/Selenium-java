package collections.map.comparator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class SortingMap {

	public static void main(String[] args) {

		ArrayList<Name> al = new ArrayList<Name>();

		Name name1 = new Name("Girish", "Kakwani");
		Name name2 = new Name("Ankita", "Kakwani");

		Name name3 = new Name("Rishiita", "Kakwani");

		HashMap<Integer, Name> map = new HashMap<Integer, Name>();

		LinkedHashMap<Integer, Name> sortedMap = new LinkedHashMap<Integer, Name>();

		map.put(1, name1);
		map.put(2, name2);
		map.put(3, name3);

		for (Entry<Integer, Name> e : map.entrySet()) {
			al.add(e.getValue());

		}

		Comparator<Name> cm = Comparator.comparing(Name::getFirstName);

		Collections.sort(al, cm);

//		for(Name n : al) {
//		System.out.println(n.firstName);
//		System.out.println(n.lastName);
//		}
		for (Name nm : al) {

			for (Entry<Integer, Name> e : map.entrySet()) {

				if (nm.getFirstName().equals(e.getValue().firstName)) {

					sortedMap.put(e.getKey(), nm);
				}
			}

		}

		// Printing sorted Map
		for (Entry<Integer, Name> e : sortedMap.entrySet()) {

			System.out.println(e.getKey() + " " + e.getValue().firstName + " " + e.getValue().lastName);

		}

	}

}
