//Map is used to perform operations on all the objects in the collection


package Streams;

import java.util.Arrays;
import java.util.List;

public class MapExample1 {
	public static void main(String[] args) {

		List<String> l = Arrays.asList("girsh", "kunal", "ankita", "test");
		
		   l.stream().map(s->s.toUpperCase()).forEach(System.out::println);;
		
		
		
		
		
		
		

	}

}
