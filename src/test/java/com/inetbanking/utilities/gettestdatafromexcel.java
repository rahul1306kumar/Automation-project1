package com.inetbanking.utilities;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class gettestdatafromexcel {
	
	public static Object[][] gettestdatafromexcel(String sheetname){
		
		File excelfile=new File(System.getProperty("user.dir")+"\\Testdata\\Testdata.xlsx");
		
		XSSFWorkbook workbook=null;
		
		try {
			
			FileInputStream fisexcel=new FileInputStream(excelfile);
			workbook=new XSSFWorkbook();
			
		} catch(Throwable e) {
			
			e.printStackTrace();
		}
		
		XSSFSheet sheet=workbook.getSheet(sheetname);
		
		int rows=sheet.getLastRowNum();
		int cols=sheet.getRow(0).getLastCellNum();
		
		
		Object[][] data=new Object[rows][cols];
		
		for(int i=0;i<rows;i++) {
			
			XSSFRow row=sheet.getRow(i+1);
			
			for(int j=0;j<cols;j++) {
				
				XSSFCell cel=row.getCell(j);
				
				CellType celltype=cel.getCellType();
				
				switch(celltype) {
				
				case STRING:
					data[i][j]=cel.getStringCellValue();
					break;
					
				case NUMERIC:
					data[i][j]=cel.getNumericCellValue();
					break;
					
				case BOOLEAN:
					data[i][j]=cel.getBooleanCellValue();
					break;
					
				
				
				
				
				
				
				}
				
			}
			
		}
		
		return data;
		
		
		
		
		
		
		
	}
	
	
	

}
