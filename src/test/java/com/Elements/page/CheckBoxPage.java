package com.Elements.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.PageFactory.BasePage;

public class CheckBoxPage extends BasePage{

	public CheckBoxPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath = "//li[@class='btn btn-light active']")
	WebElement chkHomePage;
	
	public void checkHomeBox() {
		chkHomePage.click();
	}

}
