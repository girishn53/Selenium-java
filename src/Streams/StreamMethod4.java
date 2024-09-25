package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMethod4 {

	public static void main(String[] args) {
		List<String> l = Arrays.asList("Girish","Ankita", "Rashi" );

		Optional<String> o = l.stream().findAny();

		System.out.println(o.get());
		
		System.out.println("---------------------------");

		// find first

		Optional<String> p = l.stream().findFirst();

		System.out.println(p.get());
	}

}
