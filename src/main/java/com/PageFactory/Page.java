package com.PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Page {

	protected static WebDriver driverCurrent;
	
	public Page(WebDriver driver) {
		driverCurrent = driver;
	}

	public <TPage extends BasePage> TPage getInstance(Class<TPage> pageClass) {

		return PageFactory.initElements(driverCurrent, pageClass);

	}
	

	public static WebDriver getCurrentDriver() {
		
		return driverCurrent;
	}
	
	
}
