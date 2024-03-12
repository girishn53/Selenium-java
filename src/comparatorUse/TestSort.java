package comparatorUse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestSort {

	public static void main(String[] args) {

		Student s1 = new Student("Girish", 1, 10);

		Student s2 = new Student("Ankita", 2, 18);

		Student s3 = new Student("Richa", 3, 25);

		ArrayList<Student> al = new ArrayList<Student>();

		al.add(s1);
		al.add(s2);
		al.add(s3);
//Alphabetic sort
		Comparator<Student> cm1 = Comparator.comparing(Student::getName);

		Collections.sort(al, cm1);

		System.out.println("Sorting by Name");

		for (Student s : al) {
			System.out.println(s.getName());
		}

//		Comparator<Student> cm2 = Comparator.comparing(Student::getRollno);
//
//		Collections.sort(al, cm2);
//
//		System.out.println("Sorting by Roll number");
//
//		for (Student s : al) {
//			System.out.println(s.getRollno() + " " + s.getName() + " " + s.getAge());
//		}
//
	}

	}
