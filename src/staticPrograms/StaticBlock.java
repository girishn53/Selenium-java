package staticPrograms;

public class StaticBlock {

	
	//This will execute before main method, before JDK 1.7 It was allowed to execute without main
	//main method but now error is thrown in new JDK
	static {

		System.out.println("In static block");
	}
	
	
	
	
	
	public static void main(String[] args) {
		System.out.println("In main method");
	}

}
