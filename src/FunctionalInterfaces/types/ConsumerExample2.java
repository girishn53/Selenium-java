package FunctionalInterfaces.types;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Employeee {

	String name;

	int salary;

	public Employeee(String name, int salary) {

		this.name = name;

		this.salary = salary;

	}

}

public class ConsumerExample2 {
	public static void main(String[] args) {

		Employeee e1 = new Employeee("Girish", 100000);
		Employeee e2 = new Employeee("Ankita", 500000);
		Employeee e3 = new Employeee("Rasahi", 1500000);

		ArrayList<Employeee> al = new ArrayList<Employeee>();

		al.add(e1);
		al.add(e2);
		al.add(e3);

		// Function which gives bonus

		Function<Employeee, Integer> f = e -> {
			int sal = e.salary;

			int bonus = 0;

			bonus = sal * 10 / 100;

			return bonus;

		};

		Predicate<Integer> p = i -> (i > 10000);

		Consumer<Employeee> c = emp -> {

			System.out.println(emp.name);

		};

		for (Employeee e : al) {

			int b = f.apply(e);

			if (p.test(b)) {

				c.accept(e);
			}

		}

	}

}
