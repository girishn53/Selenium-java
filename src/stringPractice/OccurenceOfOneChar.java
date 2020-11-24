package stringPractice;

import java.util.Scanner;

public class OccurenceOfOneChar {

	public static void main(String[] args) {
	
		Scanner s=new Scanner(System.in);
		
		System.out.println("Please enter the string ");
		
		 String inString = s.nextLine();

		 System.out.println("Please enter the char to count in given string ");
		 
		   char c1 = s.next().charAt(0);
		 
		   occurenceOfAChar(c1,inString);
		   
		 
	}

	public static void occurenceOfAChar(char ch, String inputString) {
		int counter = 0;
		char c[] = inputString.toCharArray();

		for (int i = 0; i < c.length; i++) {

			if (ch == c[i]) {
				counter++;

			}

			
		}
		System.out.println("Count of char " + ch + " in string is " + counter);

	}

}
