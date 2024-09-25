//distinct is used to find unique elements it is a non-terminal method
//Limit is also a non terminal method
//Count is used to count the number of elements

package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMethods {

	public static void main(String[] args) {

		List<String> l = Arrays.asList("Car", "Jeep", "Car", "cycle");

		
		List<String> uniqueElements = l.stream().distinct().collect(Collectors.toList());

		System.out.println(uniqueElements);

		//Count is used to count the number of objects
		long count = l.stream().distinct().count();

		System.out.println(count);
	}

}
