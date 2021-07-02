package com.automate.restAPI;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC002_PostRequest {
	
	@Test
	void createEmpData() 
	{
		
		RestAssured.baseURI="https://reqres.in/api/users";
		
		RequestSpecification httprequest = RestAssured.given();
		
		//creating JSON obj
		JSONObject reqParam = new JSONObject();
		
		// JSON body
		reqParam.put("name", "morpheus");
		reqParam.put("job", "leader");
		
		httprequest.header("Content-Type", "application/json");
		
		httprequest.body(reqParam.toJSONString());
		
		Response response = httprequest.request(Method.POST);
		
		String res = response.getBody().asString();
		
		System.out.println(res);
		
		int status =response.getStatusCode();
		
		//status code validation
		Assert.assertEquals(status,201,"API returned 200 status code");
		
		//body content validation
		String  id = response.jsonPath().get("id");
		System.out.println(id);
	}

}
