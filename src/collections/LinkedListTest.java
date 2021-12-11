//Linked list uses doubly linked list 
//It is fast than array list
//It is used for manipulation of data
//It is fast because less shifting of bits is required
//It has methods like addFirst() and addLast()

package collections;

import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		
		
		LinkedList<String> l =new LinkedList<String>();
		
		l.add("Hello");
		l.add("Welcome");
		l.addFirst("Girish");
		l.addLast("Ankita");
		
		System.out.println(l);
		
	}

}
