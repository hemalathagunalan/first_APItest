package testing.API.Automation;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;


@Test
public class Test_One {
	
	public void test_api()
	{
		Response response = RestAssured.get("http://services.groupkt.com/country/get/iso2code/IN");
	  System.out.println(response.asString());
	}
	
@Test
	public void invalid_check()
	{
		Response response = RestAssured.get("http://services.groupkt.com/country/get/iso2code/zzzz");
	System.out.println(response.asString());
	}
}
