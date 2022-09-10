package com.Elements.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.PageFactory.BasePage;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//*[name()='path' and contains(@d,'M16 132h41')]")
	WebElement elements;

	public TextBoxPage openElementPage() {
		click(elements);
		return getInstance(TextBoxPage.class);

	}

}
