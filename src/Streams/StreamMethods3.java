package Streams;

import java.util.HashSet;
import java.util.Set;

public class StreamMethods3 {

	public static void main(String[] args) {

		Set<String> s = new HashSet<String>();

		s.add("One Apple");
		s.add("One Mango");
		s.add("Two apples");
		s.add("More grapes");
		s.add("Two guavas");
//Anymatch
		boolean b = s.stream().anyMatch(value ->

		{
			return value.startsWith("One");
		}

		);

		System.out.println(b);

		//All match
		boolean k = s.stream().allMatch(value ->

		{
			return value.startsWith("One");
		}

		);

		System.out.println(k);

	}

}
