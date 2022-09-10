package com.Google.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.PageFactory.BasePage;

public class SearchKeyWordPage extends BasePage{

	public SearchKeyWordPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath = "//a[normalize-space()='Images']")
	WebElement images;

	public void openImages() {
		click(images);
	}
	

}
