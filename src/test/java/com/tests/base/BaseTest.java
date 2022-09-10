package com.tests.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.PageFactory.DriverFactory;
import com.PageFactory.Page;
import com.Utils.Configuration;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	public Page page;

	public WebDriver driver;

	ThreadLocal<WebDriver> driver2 = new ThreadLocal<WebDriver>();
	
	@Parameters({ "browser" })
	@BeforeMethod
	public void setUp(String browser) {
		Configuration.setValue("browser", browser);
		if (browser.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--incognito");
			
			driver = new ChromeDriver(options);
		} else if (browser.equalsIgnoreCase("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			FirefoxOptions fOptions = new FirefoxOptions();
			System.setProperty(FirefoxDriver.SystemProperty.DRIVER_USE_MARIONETTE,"true");
			System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"/dev/null");
			fOptions.addArguments("-private");
			fOptions.addArguments("-start-maximized");

			driver = new FirefoxDriver(fOptions);
		}

		DriverFactory.getInstance().setDriver(driver);
		driver = DriverFactory.getInstance().getDriver();
		driver.get(Configuration.getValue("baseURLGoogle"));

		page = new Page(driver);

	}

	

	@AfterMethod
	public void tearDown() {
		DriverFactory.getInstance().closeBrowser();
	}

}
