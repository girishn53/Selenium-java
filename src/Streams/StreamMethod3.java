package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMethod3 {

	public static void main(String[] args) {

		List<Integer> l = Arrays.asList(10, 67, 54, 87, 34);

		Optional<Integer> min = l.stream().min((val1, val2) -> {
			return val1.compareTo(val2);

		});

		System.out.println(min.get());

	}

}
