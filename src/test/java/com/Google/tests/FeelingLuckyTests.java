package com.Google.tests;

import org.testng.annotations.Test;

import com.Google.Page.FeelingLuckyPage;
import com.Google.Page.HomePage;
import com.Utils.Log;
import com.tests.base.BaseTest;

public class FeelingLuckyTests extends BaseTest {

	@Test
	public void feelingLucky() {
		HomePage homePage = page.getInstance(HomePage.class);
		Log.info("Clicking on I'm feeling Lucky Button");
		FeelingLuckyPage feelingLuckyPage = homePage.openFeelingLucky();
		Log.info("Verifying if URL now contains Doodle");
		feelingLuckyPage.verifyURL();
		
		
	}
	
}
