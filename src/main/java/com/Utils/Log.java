package com.Utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log {
	
	private static final Logger logging = LogManager.getLogger(Log.class);
	
	public static void info(Object logMsg) {
		if(Boolean.parseBoolean(Configuration.getValue("loggingEnabled"))) {
			logging.info(logMsg);
		}
	}
	
	public static void warn(Object logMsg) {
		if(Boolean.parseBoolean(Configuration.getValue("loggingEnabled"))) {
			logging.warn(logMsg);
		}
	}
	
	public static void debug(Object logMsg) {
		if(Boolean.parseBoolean(Configuration.getValue("loggingEnabled"))) {
			logging.debug(logMsg);
		}
	}
	
	public static void error(Object logMsg) {
		if(Boolean.parseBoolean(Configuration.getValue("loggingEnabled"))) {
			logging.error(logMsg);
		}
	}
	
	public static void trace(Object logMsg) {
		if(Boolean.parseBoolean(Configuration.getValue("loggingEnabled"))) {
			logging.trace(logMsg);
		}
	}
	
}
