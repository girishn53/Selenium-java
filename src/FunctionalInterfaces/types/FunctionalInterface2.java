package FunctionalInterfaces.types;

import java.util.ArrayList;
import java.util.function.Function;

class Employee {

	String name;

	int salary;

	Employee(String name, int salary)

	{

		this.name = name;

		this.salary = salary;
	}

}

public class FunctionalInterface2 {
	public static void main(String[] args) {

		ArrayList<Employee> al = new ArrayList<Employee>();

		al.add(new Employee("Girish", 100000));
		al.add(new Employee("Ankita", 50000));

		Function<Employee, Integer> f = e -> {
			int sal = e.salary;
			int bonus=0;
			if (sal > 51000) {
				bonus = sal * 10 / 100;
			}

			return bonus;

		};

		for (Employee e : al) {

			int bonus = f.apply(e);
			
			System.out.println(bonus);

		}

	}
}