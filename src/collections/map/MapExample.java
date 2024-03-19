//Map stores the data in key-value form 

//Map interface has 3 classes 

//Hashmap  linkedhashmap TreeMap

//For traverse we need to convert as map into a set by using keyset method
//Hashmap contains only unique keys
//HashMap allows one null key and multiple null values
//Hashmap no order

//Linkedhashmap insertion order is maintained
//TreeMap maintains asc order on the basis of keys

package collections.map;

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
		
		//KeySet method returns all the keys stored in a map in the set 
		//and we can iterate the map by map.get(key)
		
		  Set<String> keys = map.keySet();
		  
		  for(String key:keys)
		  {
			  
			  System.out.println("Key is "+key +" and value is "+map.get(key));
			  
		  }

	}

}
