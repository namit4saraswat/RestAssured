package com.reports;

import com.aventstack.extentreports.ExtentTest;

public class ExtentTestFactory {

	private ExtentTestFactory() {

	}

	private static ExtentTestFactory instance = new ExtentTestFactory();

	public static ExtentTestFactory getInstance() {
		return instance;
	}

	ThreadLocal<ExtentTest> extentTest = new ThreadLocal<ExtentTest>();

	public void setExtentTest(ExtentTest extentTestParam) {
		extentTest.set(extentTestParam);
	}

	public ExtentTest getExtentTest() {
		return extentTest.get();
	}

}
