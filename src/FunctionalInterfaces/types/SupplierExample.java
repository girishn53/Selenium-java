//Supplier doesn't takes any param it just gives
//It has get method

//Supplier<R> where R is return type
package FunctionalInterfaces.types;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierExample {

	public static void main(String[] args) {
		
		Supplier<Date> s = ()->new Date();
		
		System.out.println(s.get());
		
		
	}

}
