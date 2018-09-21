package testing.API.Automation;
import org.testng.annotations.*;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import java.util.NoSuchElementException;

@Test
public class Test_two{
		
	public void testing_API()
	{
		try {
		Response response=RestAssured.get("http://services.groupkt.com/country/get/iso2code/UZZZZ");
		System.out.println(response.asString());
	}
		catch(NoSuchElementException e)
		{
			System.out.println(e.getMessage());
		}
	}
}
