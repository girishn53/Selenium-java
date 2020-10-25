package deserializeJson;

public class TestCode {
  static Customer customer;
	
public static void main(String[] args) {
		JsonDataReader js=new JsonDataReader();
		
		customer=js.getCustomerByName("Lakshay");
System.out.println(customer.firstName);
System.out.println(customer.lastName);
	}

}
