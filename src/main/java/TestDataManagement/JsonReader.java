package TestDataManagement;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.fasterxml.jackson.core.JsonParser;

public class JsonReader {
	
	public static String getTestData(String input) throws IOException, ParseException
	{
		String testdata;
		return testdata = (String) getJsonData().get(input);
		
	}
	
	public static JSONObject getJsonData() throws IOException, ParseException
	{
		File file = new File("C:\\Users\\samarjain\\eclipse-workspace\\MSE_JacksonTutorials\\src\\main\\resources\\TestData\\data.json");
		
		String json = FileUtils.readFileToString(file,"UTF-8");
		
		Object obj = (Object) new JSONParser().parse(json);
		
		JSONObject jsonObj = (JSONObject) obj;
		
		return jsonObj;
	}

}
