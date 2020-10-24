//This program finds the common string elements in array

package arrayPractice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindCommonStrings {

	public static void main(String[] args) {

		String arr1[] = { "Girish", "Java", "C++", "Vb.net" };
		String arr2[] = { "Ankita", "Java", "C++", "Vb.net" };

		Set<String> commonElements = new HashSet<String>();

		System.out.println("Array1 is" + Arrays.toString(arr1));

		System.out.println("Array2 is" + Arrays.toString(arr2));

		for (int i = 0; i < arr1.length; i++) {

			for (int j = 0; j < arr2.length; j++) {

				if (arr1[i] == arr2[j]) {
					commonElements.add(arr1[i]);

				}
			}

		}
		System.out.println("Common string elements are " + commonElements);
	}

}
