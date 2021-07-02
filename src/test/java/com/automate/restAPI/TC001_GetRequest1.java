package com.automate.restAPI;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC001_GetRequest1 {
	
	@Test
	void getEmployeeData()
	{
		//BaseEndpointURL
		RestAssured.baseURI="http://dummy.restapiexample.com/api/v1/employee";
		
		//request object
		RequestSpecification request = RestAssured.given();
		
		//response object
		Response response = request.request(Method.GET,"/1");
		
		//print response
		String res = response.getBody().asString();
		
		System.out.println(res);
		
		//verification - status code
		int status = response.getStatusCode();
		
		Assert.assertEquals(status,200,"API returned 200 status code");
		System.out.println(status);
		
		String staLine = response.getStatusLine();
		System.out.println(staLine);
	}

}
