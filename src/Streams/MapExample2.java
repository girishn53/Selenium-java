package Streams;

import java.util.ArrayList;
import java.util.List;

class Employee {

	String name;

	int salary;

	public Employee(String name, int salary) {

		this.name = name;
		this.salary = salary;
	}

}

public class MapExample2 {

	public static void main(String[] args) {

		List<Employee> l = new ArrayList<Employee>();
		Employee e1 = new Employee("Goldy", 60000);
		Employee e2 = new Employee("Ravi", 90000);
		l.add(e1);
		l.add(e2);

		l.stream().filter(e -> e.salary > 70000).map(e -> e.name.toUpperCase()).forEach(System.out::println);

	}

}
