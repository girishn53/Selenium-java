package initblock;

//The instance initializer block is created when instance of the class is created.
//The instance initializer block is invoked after the parent class constructor is invoked (i.e. after super() constructor call).
//The instance initializer block comes in the order in which they appear.

//The Java compiler copies the init block in constuctor and paster the code after super() keyword
   

public class InstanceIntializerblock {

	
	int speed;
	
	
	public InstanceIntializerblock() {
		
		
		System.out.println("In constructor");
		
		
		
	}
	
	{
		speed = 5;
		
		System.out.println("In init block");
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		
		InstanceIntializerblock a = new InstanceIntializerblock();
		
		InstanceIntializerblock b = new InstanceIntializerblock();
		

	}

}
