package com.Elements.tests;

import org.testng.annotations.Test;

import com.Elements.page.HomePage;
import com.Elements.page.TextBoxPage;
import com.tests.base.BaseTest;

public class TextBoxTests extends BaseTest {

	
	@Test
	public void fillForm() {
		HomePage homePage = page.getInstance(HomePage.class);
		TextBoxPage textBoxPage =  homePage.openElementPage();
		textBoxPage.openTextBox();
	}
	
	
}
