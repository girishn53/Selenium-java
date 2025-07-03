package FunctionalInterfaces.types.Predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

class Student {

	String name;

	int salary;

	int age;

	Student(String name, int salary, int age) {
		this.name = name;

		this.salary = salary;

		this.age = age;

	}

}

public class PredicateExample3 {

	public static void main(String[] args) {

		Student s = new Student("Gaurav", 3000, 15);

		Predicate<Student> p = (student) -> (student.salary > 2000 && student.age > 10);

		System.out.println(p.test(s));

		// BY creating mutiple students and putting in arraylist

		Student s1 = new Student("Geet", 3000, 12);
		Student s2 = new Student("Gudu", 1000, 11);

		ArrayList<Student> al = new ArrayList<Student>();

		al.add(s1);
		al.add(s2);

		for (Student t : al) {

			if (p.test(t)) {
				System.out.println(t.name);
			}

		}

	}

}
