package collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSort {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();

		al.add(10);
		al.add(89);
		al.add(98);

		al.add(200);
		// Max function
		System.out.println("Max value is " + Collections.max(al));

		// Sorting in asc order

	//	Collections.sort(al);
		
		
//  sorting in desc order
		//Collections.sort(al,Collections.reverseOrder());
		
		
		
		System.out.println("Sorted list is");
		for (int a : al) {
			System.out.println(a);

		}

	}

}
