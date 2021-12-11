//Hash set doesn't allow duplicate elements
//It doesn't have any order in which elements are stored

//It doesn't maintain the insertion order

package collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	public static void main(String[] args) {

		HashSet<String> hs = new HashSet<String>();

		hs.add("Girish");
		hs.add("Ankita");
		hs.add("Rishiita");

		// Removing an element
		hs.remove("Girish");
		// It is used to clear a set
		// hs.clear();
		Iterator<String> itr = hs.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());

		}

	}

}
