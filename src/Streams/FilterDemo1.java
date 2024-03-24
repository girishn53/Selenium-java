//Stream is applied to collections 
//After applying streams we can use method filter, sorted, map , count etc

package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FilterDemo1 {

	public static void main(String[] args) {

		List<Integer> al = Arrays.asList(10, 54, 23, 98, 212);

		List<Integer> evenElements = new ArrayList<Integer>();

		// to find the even elements we use filter
		Predicate<Integer> p = i -> i % 2 == 0;

		evenElements =	al.stream().filter(p).collect(Collectors.toList());
		System.out.println(evenElements);
		
		
		//The above could be written as
		
		al.stream().filter(p).forEach(n->System.out.println(n));
		
                 //or
		
		al.stream().filter(p).forEach(System.out::println);
		
		
		
	}

}
