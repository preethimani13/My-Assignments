package week4.day4;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class DataReadByExcel1 {
	
	public static String[][] runReadData() throws IOException {
		
		XSSFWorkbook wb = new XSSFWorkbook("./Sheet/CreateOpportunity.xlsx");
		XSSFSheet sheet = wb.getSheetAt(0);
		
		int row = sheet.getLastRowNum();
		
		System.out.println(row);
		
		int cell = sheet.getRow(1).getLastCellNum();
		
		System.out.println(cell);
		String[][] data = new String[row][cell];
		for (int i = 1; i <= row; i++) {
			XSSFRow row2 = sheet.getRow(i);
			
			for (int j = 0; j <cell; j++) {
				XSSFCell cell2 = row2.getCell(j);
				data[i-1][j]=cell2.getStringCellValue();
			}
		}
		
		wb.close();
		return data;
		
	}

}
