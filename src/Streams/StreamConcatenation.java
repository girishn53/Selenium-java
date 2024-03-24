//We can concat two string using concat method

package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamConcatenation {

	public static void main(String[] args) {

		List<String> al = Arrays.asList("Gk", "team", "one");
		List<String> al1 = Arrays.asList("Gk1", "team1", "one1");

		Stream<String> s1 = al.stream();
		Stream<String> s2 = al1.stream();

		List<String> l3 = Stream.concat(s1, s2).collect(Collectors.toList());

		System.out.println(l3);

	}

}
