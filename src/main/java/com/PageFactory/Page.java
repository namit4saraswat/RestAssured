package com.PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Page {

	WebDriver driver;
	
	public Page(WebDriver driver) {
		this.driver = driver;
	}

	public <TPage extends BasePage> TPage getInstance(Class<TPage> pageClass) {

		return PageFactory.initElements(driver, pageClass);

	}
	
}
