package com.Elements.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.PageFactory.BasePage;

public class TextBoxPage extends BasePage {

	public TextBoxPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//li[@class='btn btn-light active']")
	WebElement textBox;

	public void openTextBox() {
		click(textBox);
	}

}
