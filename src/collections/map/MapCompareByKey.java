//This class shows how to sort a map by keys
//It sorts the key in asc order

package collections.map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapCompareByKey {

	public static void main(String[] args) {
		Map<Integer, String> m = new HashMap<Integer, String>();

		m.put(110, "zubi");
		m.put(103, "Girish");
		m.put(104, "Ankita");
		
		
		m.entrySet()
		.stream()
		.sorted(Map.Entry.comparingByKey(
				))
	 .forEach(System.out::println);  
	
	
//		 Set s=   m.keySet();
//		 
//		 Iterator itr=s.iterator();
//		 
//		 while(itr.hasNext())
//		 {
//			 System.out.println( itr.next());
//			
//		 }
//		
//		
	}

}
