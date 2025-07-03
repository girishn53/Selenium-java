//input Hi Girish

//Output Girish Hi
package stringPractice;

import java.util.Scanner;

public class SwapString {

	public static void main(String[] args) {
		String first = "";

		String second = "";
		
		String inputString = "";

		System.out.println("Please enter first and second String");
		Scanner sc = new Scanner(System.in);

		first = sc.nextLine();
		second = sc.nextLine();

		sc.close();

		inputString = first + " " + second;

		System.out.println("Input string is " + inputString);

		swapString(inputString);
	}

	public static void swapString(String inputString) {

		inputString = inputString.trim();
		String finalString = " ";

		String arr[] = inputString.split("\\s+");

		int len = arr.length;

		for (int i = len - 1; i >= 0; i--) {

			finalString = finalString + arr[i];

			System.out.print(" ");

		}

		System.out.println("Swapped String is " + finalString);
	}

}
