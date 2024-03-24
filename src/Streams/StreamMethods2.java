package Streams;

import java.util.Arrays;
import java.util.List;

public class StreamMethods2 {

	public static void main(String[] args) {

		List<Integer> l = Arrays.asList(1, 10, 45, 76, 87, 98);

		// Finding even elements and counting

		long count = l.stream().filter(i -> i % 2 == 0).count();
		
		System.out.println(count);

	}

}
