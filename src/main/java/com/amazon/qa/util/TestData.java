package com.amazon.qa.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestData 
{
	public String testData(int row, int cell) throws IOException
	{
	String address = "./ExcelTestData/amazonLoginData.xlsx";
	FileInputStream file = new FileInputStream(address);
	XSSFWorkbook book = new XSSFWorkbook(file);	
	return  book.getSheet("data").getRow(row).getCell(cell).getStringCellValue();	
}
}
