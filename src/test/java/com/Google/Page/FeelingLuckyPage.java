package com.Google.Page;

import org.openqa.selenium.WebDriver;

import com.PageFactory.BasePage;
import com.PageFactory.Page;

public class FeelingLuckyPage extends BasePage {

	public FeelingLuckyPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void verifyURL() {
		Page.getCurrentDriver().getCurrentUrl().contains("doodles");
	}

}
