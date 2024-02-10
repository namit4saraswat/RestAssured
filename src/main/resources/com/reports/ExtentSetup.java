package com.reports;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.Utils.Configuration;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentSetup {
	static ExtentReports extent;
	static ExtentTest test;
	public static ExtentReports setUpExtentReport() {
		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yy HH-mm-ss");
		Date date = new Date();
		String actualDate = format.format(date);
		
		String reportPath = System.getProperty("user.dir") + "/Reports/ExecutionReport" + actualDate + ".html";
		ExtentSparkReporter sparkReport = new ExtentSparkReporter(reportPath);
		extent = new ExtentReports();
		extent.attachReporter(sparkReport);
		
		sparkReport.config().setDocumentTitle("Test Report");
		sparkReport.config().setTheme(Theme.DARK);
		sparkReport.config().setReportName("ExecutionReport" + actualDate + ".html");
		
		extent.setSystemInfo("Executed on Environment: ", Configuration.getValue("baseURLGoogle"));
		extent.setSystemInfo("Executed on Browser: ", Configuration.getValue("browser"));
		extent.setSystemInfo("Executed by User: ", System.getProperty("user.name"));
		extent.setSystemInfo("Executed on OS: ", System.getProperty("os.name"));
		
	
		return extent;
	}
	
}
