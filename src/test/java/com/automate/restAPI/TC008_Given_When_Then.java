package com.automate.restAPI;

import static io.restassured.RestAssured.*;

import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class TC008_Given_When_Then {

	@Test
	void fnUseOfWhenThen() 
	{
		given()
		.param("page","2")
		.auth().none()
		.when().get("https://reqres.in/api/users")
		.then()
		.statusCode(200).body("page", equalTo(2));
		 
		// https://reqres.in/api/users?page=2
	}
}
