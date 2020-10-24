//This program deletes element in an array

package arrayPractice;

import java.util.Scanner;

public class DeleteElement {

	public static void main(String[] args) {
		int size, count = 0, del;

		int arr[] = new int[30];

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter the size ");
		size = sc.nextInt();

		for (int i = 0; i < size; i++) {

			arr[i] = sc.nextInt();
		}

		System.out.println("Please enter the element to be deleted ");

		del = sc.nextInt();

		for (int i = 0; i < size; i++) {

			if (arr[i] == del) {

				for (int j = i; j < (size - 1); j++) {

					arr[j] = arr[j + 1];

				}
				count++;
				break;

			}
		}

		if (count == 0) {
			System.out.println("Element to be deleted is not found in array ");
		}

		else {

			System.out.println("Element is deleted");
		}

		System.out.println("Array after deletion is ");
		for (int i = 0; i < (size - 1); i++) {

			System.out.println(arr[i]);
		}
	}

}
