package com.Google.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.Elements.page.TextBoxPage;
import com.PageFactory.BasePage;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//input[@title='Search']")
	WebElement search;
	
	@FindBy(xpath = "//div[@class='CqAVzb lJ9FBc']//input[@name='btnK']")
	WebElement searchButton;
	
	@FindBy(xpath = "@FindBy(xpath = \"//div[@class='CqAVzb lJ9FBc']//input[@name='btnK']\")\r\n"
			+ "	WebElement searchButton;")
	WebElement feelingLucky;

	public SearchKeyWordPage searchKeyWord() {
		sendKeys(search, "Namit Saraswat");
		click(searchButton);
		return getInstance(SearchKeyWordPage.class);
	}
	
	public FeelingLuckyPage openFeelingLucky() {
		click(feelingLucky);
		return getInstance(FeelingLuckyPage.class);
	}
	
}