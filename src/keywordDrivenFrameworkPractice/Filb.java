package keywordDrivenFrameworkPractice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Filb {

	// To store generic reusable methods

			// generic reusable meethod to read the data from excel sheet

			public String readExcelData(String excelPath, String sheetName, int rowCount, int cellCount)
					throws EncryptedDocumentException, IOException 
			{
				FileInputStream fis = new FileInputStream(excelPath);
				Workbook wb = WorkbookFactory.create(fis);
				Sheet sheet = wb.getSheet(sheetName);
				Row row = sheet.getRow(rowCount);
				Cell cell = row.getCell(cellCount);
				String data = cell.getStringCellValue();
				return data;

			}

			// generic reusable method to get last rowcount

			public int rowCount(String excelPath, String sheetName) throws EncryptedDocumentException, IOException
			{
				FileInputStream fis = new FileInputStream(excelPath);
				Workbook wb = WorkbookFactory.create(fis);
				Sheet sheet = wb.getSheet(sheetName);
				int rc = sheet.getLastRowNum();
				return rc;
			}

			// Generic reusable method to write data in excel sheet

			public void writeExcelData(String excelPath, String sheetName, int rowCount, int cellCount, String data)
					throws EncryptedDocumentException, IOException
			{
				FileInputStream fis = new FileInputStream(excelPath);
				Workbook wb = WorkbookFactory.create(fis);
				Sheet sheet = wb.getSheet(sheetName);
				Row row = sheet.getRow(rowCount);
				Cell cell = row.createCell(cellCount);
				cell.setCellValue(data);

				FileOutputStream fos = new FileOutputStream(excelPath);
				wb.write(fos);

			}
	        
			
	      // Generic reusable method to read the data from excel data
			
			      public String readPropertyData(String propPath, String key) throws IOException
			      {
			    	FileInputStream fis = new FileInputStream(propPath);
			    	
			        Properties prop = new Properties();
			        prop.load(fis);
			    	String value = prop.getProperty(key);
			    	return value;
			      }



}
