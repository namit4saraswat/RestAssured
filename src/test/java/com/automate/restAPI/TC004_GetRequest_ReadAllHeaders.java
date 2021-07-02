package com.automate.restAPI;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC004_GetRequest_ReadAllHeaders {

	
	@Test
	void fnReadAllHeaders() {
		RestAssured.baseURI="https://reqres.in/api/";
		
		//request object
		RequestSpecification request = RestAssured.given();
		
		//response object
		Response response = request.request(Method.GET,"unknown/2");
		//print response
		String res = response.getBody().asString();
		System.out.println(res);
		Headers allHeader = response.headers();
		
		for (Header i : allHeader) {
			
			System.out.println(i.getName());
		}
		
	}
	
}
