package com.Google.tests;

import org.testng.annotations.Test;

import com.Google.Page.FeelingLuckyPage;
import com.Google.Page.HomePage;
import com.tests.base.BaseTest;

public class FeelingLuckyTests extends BaseTest {

	@Test
	public void feelingLucky() {
		HomePage homePage = page.getInstance(HomePage.class);
		FeelingLuckyPage feelingLuckyPage = homePage.openFeelingLucky();
		feelingLuckyPage.verifyURL();
		
	}
	
}
