package interfaces;

//Since Java 8, we can have method body in interface. But we need to make it default method
public interface Java8InterfaceExample {

	default public void A() {
		System.out.println("In default method ");
	}

}
