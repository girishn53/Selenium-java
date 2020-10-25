package deserializeJson;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;

public class JsonDataReader {
	
	private final String customerJsonPath="F:\\Girish development\\Selenium-java\\src\\deserializeJson\\Customer.json";
	
	private List<Customer> customerList;
	
	
	
	
	public JsonDataReader() {
		
		customerList=getCustomerData();
		
		
		
		
	}
	
	private List<Customer> getCustomerData(){
		
		Gson gson = new Gson();
		 BufferedReader bufferReader = null;
		 try {
		 bufferReader = new BufferedReader(new FileReader(customerJsonPath));
		 Customer[] customers = gson.fromJson(bufferReader, Customer[].class);
		 return Arrays.asList(customers);
		 }catch(FileNotFoundException e) {
		 throw new RuntimeException("Json file not found at path : " + customerJsonPath);
		 }finally {
		 try { if(bufferReader != null) bufferReader.close();}
		 catch (IOException ignore) {}
		 }
		
		
		
	}
	public final Customer getCustomerByName(String customerName){
		 return customerList.stream().filter(x -> x.firstName.equalsIgnoreCase(customerName)).findAny().get();
		 }

}
