//Duplicate keys are not allowed in Hashmap
//If key is already present it will be overriden

package collections.map;

import java.util.HashMap;

public class DuplicateKeysInMap {

	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("Girish", 34);
		map.put("Ankita", 32);
		map.put("Rishiita", 2);
		map.put("Rishiita", 5);		
		
		//output {Ankita=32, Girish=34, Rishiita=5}
		
		System.out.println(map);
		
		

	}

}
