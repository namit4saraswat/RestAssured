package com.automate.restAPI;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC005_ValidateResponseBody {

	
	@Test
	void fnValidateResponse()
	{
		RestAssured.baseURI="https://reqres.in/api/";
		
		//request object
		RequestSpecification request = RestAssured.given();
		
		//response object
		Response response = request.request(Method.GET,"users/2");
		
		//print response
		String responseBody = response.getBody().asString();
		System.out.println(responseBody);
		
		//Validating one value
		Assert.assertTrue(responseBody.contains("id"));
		
		//Validating all values
		JsonPath values = response.jsonPath();
		
		System.out.println(values.get("data"));
		System.out.println(values.get("first_name"));
		System.out.println(values.get("last_name"));
		System.out.println(values.get("avatar"));
		System.out.println(values.get("id"));
	
	}
	
}
