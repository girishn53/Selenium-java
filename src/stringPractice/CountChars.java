package stringPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class CountChars {

	public static void main(String[] args) {
		String S = "Sasshhhhii";
		
		ArrayList<Integer> al =new ArrayList<Integer>();
		
		

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		char ch[] = S.toCharArray();

		for (char c : ch) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);

			}

			else

			{
				map.put(c, 1);
			}

		}

		for (Entry <Character,Integer> e : map.entrySet()) {

		System.out.println(e.getKey() + " " + e.getValue());
			
		al.add(e.getValue());
			
		
		}

		int m	  =Collections.max(al);
		
		System.out.println("The max is "+m);
		
		

		for (Entry <Character,Integer> e : map.entrySet()) {
		
		if(e.getValue().equals(m))
		
		{
			System.out.println("The repeating is ");
	
			
		}
		}
	
	}
              
}
