package com.tests.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.PageFactory.Page;
import com.Utils.CommonUtils;
import com.Utils.Configuration;

public class BaseTest {

	public Page page;

	public WebDriver driver;

	@Parameters({ "browser" })
	@BeforeMethod
	public void setUp(String browser) {
		
		System.setProperty("webdriver.gecko.driver", CommonUtils.getResourcePath("Drivers/geckodriver.exe"));
		
		if (browser.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();

		driver.get(Configuration.getValue("baseURLGoogle"));

		page = new Page(driver);
		
	}
	
	public void getDriver() {
		
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
