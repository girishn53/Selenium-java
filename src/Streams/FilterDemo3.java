package Streams;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

class Product {

	String name;
	int price;

	public Product(String name, int price) {

		this.name = name;
		this.price = price;

	}

}

public class FilterDemo3 {

	public static void main(String[] args) {

		Product p1 = new Product("Dell", 40000);
		Product p2 = new Product("Lenovo", 50000);
		Product p3 = new Product("HP", 60000);

		List<Product> l = new ArrayList<Product>();

		l.add(p1);
		l.add(p2);
		l.add(p3);

		List<Product> l1 = l.stream().filter(p -> p.price > 40000).collect(Collectors.toList());

		Iterator<Product> itr = l1.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next().name);

		}
	}

}
