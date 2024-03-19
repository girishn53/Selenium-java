//It is same as set but it maintains insertion order

package collections;

import java.util.*;

public class LinkedHashSetTest {

	public static void main(String args[]){  
		  LinkedHashSet<String> al=new LinkedHashSet<String>();  
		  al.add("Ravi");  
		  al.add("Vijay");  
		 //Duplicate element will not be stored in output
		  al.add("Ravi");  
		  al.add("Ajay");  
		  Iterator<String> itr=al.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }  
		 }  
		}  