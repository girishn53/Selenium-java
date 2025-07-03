package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo2 {

	public static void main(String[] args) {

		List<String> l = Arrays.asList("Girish", "Kunal", null);

		List<String> Y = new ArrayList<String>();
		
		Y=l.stream().filter(s->s!=null).collect(Collectors.toList());
		
		System.out.println(Y);
		
	}

}
