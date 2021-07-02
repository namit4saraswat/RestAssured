package com.automate.DataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class LoadFromExcel {
	
	@Test
	void fnLoadFromExcel() throws IOException 
	{
		FileInputStream fis = new FileInputStream(".\\Excel Data.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
	//	ExcelHelper ex = new ExcelHelper();
		int rownum = sheet.getLastRowNum();
		
		
		HashMap<String,HashMap<String,String>> data = new HashMap<String,HashMap<String,String>>();
		
		
		
		System.out.println(data.get("Leo"));
		
	}
	
	
}
