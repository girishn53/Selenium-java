package interfaces;

public class TestingInterface {

	public static void main(String[] args) {
		
		//Interface reference can point to implementing class object
		//and method of implementing class will be called
		
		
		Animal a =new Cat();
		
		a.move();
		
		Animal d=new Dog();
		
		d.move();
		
		 
		
		

	}

}
