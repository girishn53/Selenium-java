package arrayPractice;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicateElements {

	public static void main(String[] args) {

		int arr[] = new int[30];
		System.out.println("Please enter the size of array");
		Scanner sc = new Scanner(System.in);

		int size = sc.nextInt();

		
		System.out.println("Please enter the elements in the array");

		for (int i = 0; i < size; i++) {

			arr[i] = sc.nextInt();

		}

		for (int x = 0; x < size; x++) {

			for (int y = x + 1; y < size;) {
				if (arr[x] == arr[y]) {

					for (int z = y; z < size; z++) {
						arr[z] = arr[z + 1];

					}
					size = size - 1;

				}

				else
					y++;
			}

		}

		System.out.println("Array after removal of duplicate elements is ");
		
		for(int i=0;i<size;i++)
		{
			
			System.out.print(arr[i]);
			System.out.println(" ");
		
		}
	}

}
