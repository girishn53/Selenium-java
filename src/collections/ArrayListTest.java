
//Array list is a class which implements list interface

//It allows duplicate elements and it maintains insertion order


package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();

		al.add("Girish");
		al.add("Ankita");
		al.add("Goldy");

		Iterator<String> itr = al.iterator();

		while (itr.hasNext()) {

			System.out.println(itr.next());
		}

	}

}
