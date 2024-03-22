package arrayPractice;

import java.util.Arrays;

//This program finds common elements in array

public class FindCommonElements {

	public static void main(String[] args) {

		int arr1[] = { 22, 43, 23, 98, 21 };

		int arr2[] = { 82, 43, 23, 98, 20 };
		
		

		// Printing arrays

		System.out.println("arr1 is " + Arrays.toString(arr1));

		System.out.println("arr2 is " + Arrays.toString(arr2));

		// finding common elements logic

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {

					System.out.println("Common element is " + arr1[i]);

				}

			}

		}
	}

}
