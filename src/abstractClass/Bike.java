//An abstract class is an incomplete class
//It has an abstract keyword before class
//It can't be instantiated

//Methods in abstract class could be abstract or complete

//Implementing class needs to give definition of abstract methods
//Abstract class use hoti h jab class ka koi meaning na ho

//Shape class ka as such koi meaning nhi hai, ismien ek abstract draw method ho skta hai 
//Rectangle and circle class isko extend kr k draw method ko definition de skte h 

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
