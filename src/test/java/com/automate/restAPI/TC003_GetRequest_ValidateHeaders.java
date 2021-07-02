package com.automate.restAPI;

import org.junit.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC003_GetRequest_ValidateHeaders {

	@Test
	void fnValidateHeaders()
	{
		RestAssured.baseURI="https://reqres.in/api/users/";
		
		//request object
		RequestSpecification request = RestAssured.given();
		
		//response object
		Response response = request.request(Method.GET,"2");
		
		//print response
		String res = response.getBody().asString();
		System.out.println(res);
		
		//capture headers
		Headers head = response.headers();
		
		//getting header details
		//System.out.println(head);
		
		String headContentType = response.header("Content-Type");
		Assert.assertEquals(headContentType, "application/json; charset=utf-8");
	}
	
}
