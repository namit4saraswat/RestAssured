package com.PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Utils.CommonUtils;
import com.Utils.Wait;

public class BasePage extends Page {

	public BasePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public  void click(WebElement element) {
		Wait.waitForElementToBeVisible(element);
		CommonUtils.highLightElement(element);
		element.click();
		//action can also be logged into extent Report
	}
	
	public void sendKeys(WebElement element, String text) {
		Wait.waitForElementToBeVisible(element);
		CommonUtils.highLightElement(element);
		element.sendKeys(text);
	}
	
}
