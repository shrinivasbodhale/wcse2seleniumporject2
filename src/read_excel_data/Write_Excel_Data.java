package read_excel_data;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Write_Excel_Data {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	
	{
		// To write data inside excel sheet

		FileInputStream fis = new FileInputStream("./data/TestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("IPL");
		Row row = sheet.getRow(0);

		Cell cell = row.createCell(2);

		cell.setCellValue("TeamCoach");

		FileOutputStream fos = new FileOutputStream("./data/TestData.xlsx");
		wb.write(fos);
	}

}
