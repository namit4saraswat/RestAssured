package com.Utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.PageFactory.Page;

public class Wait {
	

	protected static final long TIMEOUT = Long.parseLong(Configuration.getValue("timeout"));
	static WebDriverWait explicitWait;
	
	public static void waitForElementToBeClickable(WebElement element) {
		explicitWait = new WebDriverWait(Page.getCurrentDriver(), TIMEOUT);
		
		if(waitForElementToBeVisible(element)) {
			explicitWait.until(ExpectedConditions.elementToBeClickable(element));
		}
		
	}

	public static Boolean waitForElementToBeVisible(WebElement element) {
		try {
			explicitWait = new WebDriverWait(Page.getCurrentDriver(), TIMEOUT);
			explicitWait.until(ExpectedConditions.elementToBeClickable(element));
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}

	}

}
