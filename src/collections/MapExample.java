//HashMap allows one null key and multiple null values

package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<String, String>();

		map.put("firstName", "Girish");

		map.put("lastName", "Kakwani");
		
		
		map.put("Subject", "Selenium");
		
		map.put("Location", "India");
		
		System.out.println(map);
		
		System.out.println(map.size());
		
		//KeySet method returns all the keys stored in a map in set
		
		  Set<String> keys = map.keySet();
		  
		  for(String key:keys)
		  {
			  
			  System.out.println("Key is "+key +" and value is "+map.get(key));
			  
		  }

	}

}
