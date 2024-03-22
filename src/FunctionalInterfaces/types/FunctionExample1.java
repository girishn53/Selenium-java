//Function is a type of functional interface
//It takes two params Function <T,R> where R is a return type
//It has apply method which takes one parameter
//Function<T,R> where T is input parameter and R is return type


package FunctionalInterfaces.types;

import java.util.function.Function;

public class FunctionExample1 {

	public static void main(String[] args) {

		Function<String, Integer> f = s -> (s.length());

		System.out.println("The length is " + f.apply("Girish"));

	}

}
