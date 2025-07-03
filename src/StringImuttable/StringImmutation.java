/*String class is immutable means non changeable.
 * Whenever we create an object using string literal String s ="Sachin"
 *It is created in string constant pool
 *  and if user created same string it returns the variable pointing to the same string in pool
 * If String is amended a new object is created in string constant pool and reference variable pointing to 
 * it will be returned
 *  */


package StringImuttable;

public class StringImmutation {

	public static void main(String[] args) {
	
		//String literal
		
		String s = "Girish";
		
		s.concat("Kakwani");// It will create a new object in the pool
		
		System.out.println(s); // Girish will be printed as 's' variable is pointing to Girish
		
		
		
		
		s=s.concat("Kakwani");
		
		System.out.println(s);//Girish Kakwani

	}

}
