package test;

import java.util.HashMap;
import java.util.Map;

public class MapPractice {

	
	
	public static void main(String[] args) {
	
		
		Map<String,String> m = new HashMap<>();
		
		m.put("firstName", "Girish");
		m.put("lastName", "Kakwani");
		m.put("age", "34");
		
		System.out.println(m);
		
		System.out.println("The size of the map is "+m.size());
		
		
		
	}

}
