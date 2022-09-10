package com.Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Configuration {

	private static Properties prop = new Properties();
	
	public static String getValue(String key) {
		try {
			prop.load(new FileInputStream(new File(CommonUtils.getResourcePath("config.properties"))));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return prop.getProperty(key);
		
	}
}
