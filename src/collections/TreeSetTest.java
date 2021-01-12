//It stores data in ascending order
//Rest is same as set

package collections;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		
		
		TreeSet<Integer> ts=new TreeSet<Integer>();
		
		ts.add(4);
		ts.add(2);
		ts.add(1);
		ts.add(3);
		
		
Iterator<Integer> itr=ts.iterator();
		
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			
			
		}
		
		
		
	}

}
