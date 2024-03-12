//Map stores the data in key-value form 

//Map interface has 3 classes 

//Hashmap  linkedhashmap TreeMap

//For traverse we need to convert as map into a set
//Hashmap contains only unique keys
//HashMap allows one null key and multiple null values


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
		
		  Set<String> keys = map.keySet();
		  
		  for(String key:keys)
		  {
			  
			  System.out.println("Key is "+key +" and value is "+map.get(key));
			  
		  }

	}

}
