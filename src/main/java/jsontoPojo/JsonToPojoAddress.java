package jsontoPojo;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

import Pojo.Address;

public class JsonToPojoAddress {
	
	public static void main(String[] args) throws StreamReadException, DatabindException, IOException
	{
		ObjectMapper obj = new ObjectMapper();
		
		// Deserialize Json to Pojo
		Address address = obj.readValue(
				new File("C:\\Users\\samarjain\\eclipse-workspace\\MSE_JacksonTutorials\\src\\test\\resources\\Payloads\\address.json"),Address.class);
		
		System.out.println(address.getCity());
		
		address.setCity("Mumbai");
		
		String updateJson1 = obj.writeValueAsString(address);
		
		// To print json in pretty format
		updateJson1 = obj.writerWithDefaultPrettyPrinter().writeValueAsString(address);
		
		System.out.println(updateJson1);
	}

}
