package test;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();

		al.add("Ankita");

		al.add("Girish");

		Iterator<String> itr = al.iterator();

		while (itr.hasNext()) {

			System.out.println(itr.next());
		}

	}

}
