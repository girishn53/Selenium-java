/**This class shows how to print 
 * a key and corresponding values using Entry*/

/*We can also iterate the map using entryset method*/


package collections.map;

import java.util.HashMap;
import java.util.Map;

public class MapKeyPrint {

	public static void main(String[] args) {

		Map<Integer, String> m = new HashMap<Integer, String>();

		m.put(1, "Roma");
		m.put(2, "Girish");
		m.put(3, "Ankita");
		System.out.println("Size of map is " + m.size());
		
		
	

		for (Map.Entry m1 : m.entrySet()) {
			System.out.println(m1.getKey() + " " + m1.getValue());

		}
		

	}

}
