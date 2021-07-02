package com.automate.DataDriven;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC007_DataDrivenPost {
	
	@Test(dataProvider="EmpData")
	void fnPostRequestDataDriven(String ename, String ejob) 
	{
		
		RestAssured.baseURI="https://reqres.in/api/";
		
		RequestSpecification httprequest = RestAssured.given();
		
		//creating JSON obj
		JSONObject reqParam = new JSONObject();
		
		// JSON body
		reqParam.put("name", ename);
		reqParam.put("job", ejob);
		
		httprequest.header("Content-Type", "application/json");
		
		httprequest.body(reqParam.toJSONString());
		
		Response response = httprequest.request(Method.POST,"users");
		
		String res = response.getBody().asString();
		
		System.out.println(res);
		
		int status =response.getStatusCode();
		
		//status code validation
		Assert.assertEquals(status,201,"API returned 200 status code");
		
		//body content validation
		String  id = response.jsonPath().get("id");
		System.out.println(id);
		
	}
	
	@DataProvider(name="EmpData")
	String[][] fnGetDataFromArray()
	{
		String data[][]= {{"morpheus","leader"},{"Rock","Wrestle"},{"Leo","Act"}};
		return data;
	}
	
	
	void fnGetDataFromExcel()
	{
		
	}
	
}
