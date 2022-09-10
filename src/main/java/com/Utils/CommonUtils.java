package com.Utils;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.PageFactory.Page;

public class CommonUtils {

	static WebDriver driver;
	
	public static String getResourcePath(String file) {
		Resource resource = new ClassPathResource(file);
		try {
			return resource.getFile().getAbsolutePath();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	
	public static void highLightElement(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) Page.getCurrentDriver();
		js.executeScript("arguments[0].style.border = '3px solid red'", element);
	}

}
