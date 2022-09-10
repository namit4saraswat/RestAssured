package com.Elements.tests;

import org.testng.annotations.Test;

import com.Elements.page.CheckBoxPage;
import com.tests.base.BaseTest;

public class CheckBoxTests extends BaseTest {

	@Test
	public void checkBox() {
		page.getInstance(CheckBoxPage.class).checkHomeBox();
	}
	
}
