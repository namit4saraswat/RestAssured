package com.Elements.tests;

import org.testng.annotations.Test;

import com.Elements.page.TextBoxPage;
import com.tests.base.BaseTests;

public class TextBoxTests extends BaseTests {

	
	@Test
	public void fillForm() {
		page.getInstance(TextBoxPage.class).openTextBox();
	}
	
	
}
