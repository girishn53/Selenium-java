//Predicate is a predefined functional interface
//It has test method which takes one input parameter
//It gives boolean output and can be used for checking conditional statements
//It has test method

//Predicate<T> where T is input parameter


package FunctionalInterfaces.types.Predicate;

import java.util.function.Predicate;

public class PredicateExample {

	public static void main(String[] args) {

		Predicate<Integer> p = (arg) -> (arg > 10);
		System.out.println(p.test(11));

	}

}
