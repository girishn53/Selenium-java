package arrayPractice;

import java.util.Scanner;

public class OddEvenElements {

	public static void main(String[] args) {

		System.out.println("Please enter the size of array");

		Scanner sc = new Scanner(System.in);

		int size = sc.nextInt();

		int arr[] = new int[size];

		System.out.println("Please enter the elements in array");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();

		}

		for (int j = 0; j < size; j++) {
			if (arr[j] % 2 == 0) {
				System.out.println("Even element " + arr[j]);
			}

			else
				System.out.println("odd element " + arr[j]);
		}

	}

}
