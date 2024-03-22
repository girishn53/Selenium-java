//Functional interface has only one abstract method and could be have default and static methods

package FunctionalInterfaces;

//Functional interface
interface Cab {

	// Abstract method
	public void bookCab();
}

class Test {

	public static void main(String[] args) {

		// We can write lambda expressions only with functional interface

		// The below code is shorter form instead of creating a class which implements
		// interface we can
		// use below code

		Cab cab = () -> System.out.println("Cab is booked");// Lambdaa expression

		cab.bookCab();

	}

}
