package abstractClass;

public class Honda extends Bike{

	public static void main(String[] args) {
		 Bike b =new Honda();
		 
		 b.run();
		 b.changeGear();
	}

	void run() {
		System.out.println("Honda car running");
		
	}
	}
