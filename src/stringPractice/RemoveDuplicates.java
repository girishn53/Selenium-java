package stringPractice;
//This program removes duplicate values from String and prints the string 

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		System.out.println("Please enter a string ");

		Scanner sc = new Scanner(System.in);

		String inputString = sc.nextLine();

		sc.close();

		removeDuplicates(inputString.toLowerCase());
	}

	public static void removeDuplicates(String inputString) {

		Set<String> s = new LinkedHashSet<String>();
		inputString = inputString.trim();
		String arr[] = inputString.split("\\s+");
		StringBuffer bf = new StringBuffer();
		for (String x : arr) {
		
			if(s.add(x)) {
				
				bf.append(x).append(" ");
				
			}

		}

		System.out.println("removed duplicates "+bf.toString());
		
		
		//System.out.println("removed duplicates" + s.toString().replace("[", "").replace("]", "").replaceAll(",", ""));

	}

}
