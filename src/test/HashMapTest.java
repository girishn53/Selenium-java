package test;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

	public static void main(String[] args) {
	
		HashMap<Integer, String> hm=new HashMap<Integer, String>();
		
		hm.put(1, "Mango");
		hm.put(2, "Banana");
		hm.put(3, "Apple");
		hm.put(1, "GK");
		
		hm.remove(1,"GK");
		
		for (Map.Entry m :hm.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
			
		}
		
	}

}
