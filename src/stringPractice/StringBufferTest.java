//String Buffer class is used to create mutable strings

package stringPractice;

public class StringBufferTest {

	public static void main(String[] args) {

		// Create a string object

		StringBuffer b = new StringBuffer("Hello");

		// Append methods appends the String at the end and in this way it is
		// mutable
		b.append("Java");

		System.out.println(b);

		// Reverse method reverses the String
	//	System.out.println(b.reverse());
		
		
		//delete method
		
		System.out.println(b.delete(1,3)); //3 is excluded
		
		

	}

}
