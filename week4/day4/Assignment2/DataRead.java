package week4.day5;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataRead {
	
	public static String[][] runRead() throws IOException {
	
	XSSFWorkbook wb = new XSSFWorkbook("./Sheet/CreateContact.xlsx");
	XSSFSheet sheet = wb.getSheetAt(0);
	
	int rowNum = sheet.getLastRowNum();
	
	int cellNum = sheet.getRow(1).getLastCellNum();
	
	String[][] data = new String[rowNum][cellNum];
	
	for (int i = 1; i <=rowNum; i++) {
		XSSFRow row = sheet.getRow(i);
		for(int j=0;j<cellNum;j++) {
			XSSFCell cell = row.getCell(j);
			data[i-1][j] = cell.getStringCellValue();
		}
	}
	
	wb.close();
	return data;
	
	
	
	
	}
}
