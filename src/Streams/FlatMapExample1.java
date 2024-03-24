//Flatmap function breaks collection of collections into 
//streams and then operation could be performed.
package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample1 {

	public static void main(String[] args) {

		List<Integer> l1 = Arrays.asList(1, 2);
		List<Integer> l2 = Arrays.asList(3, 4);
		List<Integer> l3 = Arrays.asList(5, 6);

		List<List<Integer>> biglist = Arrays.asList(l1, l2, l3);

		// Here we are using flatmap method to break biglist into small streams and we
		// are using map function to add 10

		List<Integer> smallList = biglist.stream().flatMap(n -> n.stream()).map(i -> i + 10)
				.collect(Collectors.toList());

		System.out.println(smallList.toString());
	}

}
