package org.exl;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {
	XSSFWorkbook workbook ;
	XSSFSheet sheet;
	XSSFCell cell;

	public void readExcelFile(String Loc) throws IOException {
		FileInputStream file = new FileInputStream(Loc);
		workbook = new XSSFWorkbook(file);
		sheet = workbook.getSheet("Adactin");
	}
	public String getExclvalue(int row,int col) {
		cell = sheet.getRow(row).getCell(col);
		String cellvalue =cell.getStringCellValue();
//		System.out.println(cellvalue);
		return cellvalue;
		//System.out.println(cellvalue);
		
	}


}
