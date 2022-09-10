package com.Utils;

public class TestRetry //implements IRetryAnalyzer
{

	int counter=1;
	int maxRetry=Integer.parseInt(Configuration.getValue("retryCount"));
	
	public boolean retry(//ITestResult result
			) {
		
		if(counter>maxRetry) {
			counter++;
			return true;
		}else {
			return false;
		}
		
	}
	
}
