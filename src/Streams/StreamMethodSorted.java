//Sorted method is used to sort the list 

package Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMethodSorted {

	public static void main(String[] args) {

		List<Integer> l = Arrays.asList(23, 87, 56, 76, 34, 65);

		List<Integer> sortedList = l.stream().sorted().collect(Collectors.toList());

		System.out.println(sortedList);

		// To sort in reverse order

		List<Integer> revOrder = l.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

		System.out.println(revOrder);
	}

}
