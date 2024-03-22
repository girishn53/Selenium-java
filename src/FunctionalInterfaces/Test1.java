package FunctionalInterfaces;

interface Taxi {

	String bookTaxi(String src, String dest);

}

public class Test1 {

	public static void main(String[] args) {

		Taxi t = (src, dest) -> {

			System.out.println("Taxi is booked" + src + " " + dest);

			return ("Price is : 500");

		};

		
		
		String p=t.bookTaxi("delhi" , "Noida");
		
		System.out.println(p);
	}

}
