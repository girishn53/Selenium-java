//An abstract class is a incomplete class
//It has an abstract keyword before class
//It can't be instantiated

//Methods in abstract class could be abstract or complete

//Implementing class needs to give definition of abstract methods

package abstractClass;

public abstract class Bike {

	Bike() {

		System.out.println("In bike constructor");
	}

	abstract void run();

	public void changeGear() {

		System.out.println("Changing gear");
	}

}
