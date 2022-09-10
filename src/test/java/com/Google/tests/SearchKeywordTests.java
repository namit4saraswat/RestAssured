package com.Google.tests;

import org.testng.annotations.Test;

import com.Google.Page.HomePage;
import com.Google.Page.SearchKeyWordPage;
import com.tests.base.BaseTest;

public class SearchKeywordTests extends BaseTest {

	@Test
	public void searchKeyword() {
		HomePage homePage = page.getInstance(HomePage.class);
		SearchKeyWordPage searchKeyWord = homePage.searchKeyWord();
		searchKeyWord.openImages();
	}
	
}
