package com.Utils;

import java.io.File;
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
	
	public static void mkDir(String dirName) {
		String folderPath = new File(dirName).getAbsolutePath();
		File file = new File(folderPath);
		if(file.isDirectory()) {
			Log.info("Directory already exist");
		}else {
			boolean flag = file.mkdir();
			if(flag) {
				Log.info("Directory " + dirName + " create successfully");
			}else {
				Log.info("Failed to create directory : " + dirName);
			}
		}
	}


}
