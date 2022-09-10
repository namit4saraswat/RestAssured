package com.Google.tests;

import org.testng.annotations.Test;

import com.Google.Page.HomePage;
import com.Google.Page.SearchKeyWordPage;
import com.Utils.Log;
import com.tests.base.BaseTest;

public class SearchKeywordTests extends BaseTest {

	@Test
	public void searchKeyword() {
		HomePage homePage = page.getInstance(HomePage.class);
		Log.info("Searching for keyword");
		SearchKeyWordPage searchKeyWord = homePage.searchKeyWord();
		Log.info("Open images related to search keyword");
		searchKeyWord.openImages();
	}
	
}
