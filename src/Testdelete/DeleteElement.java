package Testdelete;

import java.util.Scanner;

public class DeleteElement {

	public static void main(String[] args) {

		int a[] = { 10, 20, 30, 40, 50 };

		System.out.println("Please enter the element to be delete");

		Scanner sc = new Scanner(System.in);
		int size = a.length;
		int del = sc.nextInt();
		sc.close();

		int count = 0;

		for (int i = 0; i < size; i++) {

			if (a[i] == del) {

				for (int j = i; j < (size - 1); j++) {

					a[j] = a[j + 1];

					count++;

				}

			}

		}

	
		
		
		for(int k =0 ;k<(size-1);k++){
			System.out.print(a[k]);
			System.out.print(" ");
			
		}
	}

}
