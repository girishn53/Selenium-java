package FunctionalInterfaces.types.Predicate;

import java.util.function.Predicate;

public class PredicateExample2 {

	public static void main(String[] args) {

		Predicate<String> p = s -> (s.length() > 4);

		System.out.println(p.test("xy"));

		String arr[] = { "John", "Kashap", "Raja", "Kap" };

		for (String str : arr) {

			if (p.test(str)) {
				System.out.println(str);
			}

		}

	}

}
