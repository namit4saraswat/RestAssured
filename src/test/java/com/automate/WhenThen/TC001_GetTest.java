package com.automate.WhenThen;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import io.restassured.response.Response;


public class TC001_GetTest {

	@Test
	 void test1() {
		// TODO Auto-generated method stub

		
		Response response = RestAssured.get("https://reqres.in/api/users?page=2");
		
		String res = response.getBody().asString();
		
		System.out.println(res);
		System.out.println(response.getStatusCode());
		
	}
	
	@Test
	void test2() 
	{
	    given()
			.get("https://reqres.in/api/users?page=2")
		.then()
			.statusCode(200)
			.body("data.id[0]", equalTo(7));
	}

}
