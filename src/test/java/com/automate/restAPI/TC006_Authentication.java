package com.automate.restAPI;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.authentication.PreemptiveBasicAuthScheme;

public class TC006_Authentication {
	
	@Test
	void fnCheckAuthentication()
	{
		//Authentication
		PreemptiveBasicAuthScheme auth = new PreemptiveBasicAuthScheme();
		
		auth.setUserName("");
		auth.setPassword("");
		
		RestAssured.authentication=auth;
		
		//**********do***************//
		
	}

}
