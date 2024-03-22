//Consumer
//It just accepts one param and print or perform some operation
//It has accept method

//Consumer<T> where T is input parameter

package FunctionalInterfaces.types;

import java.util.function.Consumer;

public class ConsumerExample1 {

	public static void main(String[] args) {

		Consumer<String> c = (s) -> System.out.println(s);

		c.accept("Welcome");

	}

}
