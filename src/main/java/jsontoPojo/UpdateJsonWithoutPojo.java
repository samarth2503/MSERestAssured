package jsontoPojo;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;


// We can dymanically create payload by using Object mapper 
public class UpdateJsonWithoutPojo {

	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		
		ObjectMapper map = new ObjectMapper();
		
		Map<String,Object> address = map.readValue(new File("C:\\Users\\samarjain\\eclipse-workspace\\MSE_JacksonTutorials\\src\\test\\resources\\Payloads\\address.json"), 
				new TypeReference<Map<String,Object>>(){});
		
		System.out.println(address.get("city"));
		
		address.put("city", "Keral");
		
		// USed for dynamic payload
		address.put("pin", "12345");
		address.remove("house");
		
		String str = map.writeValueAsString(address);
		
		System.out.println(str);
		
		System.out.println(map.writerWithDefaultPrettyPrinter().writeValueAsString(address));
		
		

	}

}
