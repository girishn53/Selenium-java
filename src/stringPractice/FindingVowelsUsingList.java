package stringPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class FindingVowelsUsingList {

	String s = "Hi my name is girish";

	public static void main(String[] args) {
		int count = 0;
		String s = "Hi my name is girish";
		List<String> vowelsList = Arrays.asList(s.split(""));

		List<String> vowels = new ArrayList<String>();

		Iterator<String> itr = vowelsList.iterator();

		String vowel;
		while (itr.hasNext()) {
			vowel = itr.next();

			switch (vowel) {
			case "a":
			case "e":
			case "i":
			case "o":
			case "u":
                count++;
                
                
				vowels.add(vowel);
				
			}

		}

		System.out.println(vowels);
		System.out.println(count);
		System.out.println(vowels.size());
		
		Collections.sort(vowels);
		System.out.println(vowels);
		

	}

}
