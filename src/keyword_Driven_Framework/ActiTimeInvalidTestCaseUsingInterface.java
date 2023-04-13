package keyword_Driven_Framework;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;

public class ActiTimeInvalidTestCaseUsingInterface extends BaseTest {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
		BaseTest bt = new BaseTest();
		bt.setUp();

		Flib flib = new Flib();

		int rc = flib.rowCount(EXCEL_PATH, "invalidcreds");

		for (int i = 1; i <= rc; i++) 
		{
			String invalidusn = flib.readExcelData(EXCEL_PATH, "invalidcreds", i, 0);
			String invalidpwd = flib.readExcelData(EXCEL_PATH, "invalidcreds", i, 1);

			driver.findElement(By.name("username")).sendKeys(invalidusn);
			driver.findElement(By.name("pwd")).sendKeys(invalidpwd);
			driver.findElement(By.id("loginButton")).click();

			Thread.sleep(3000);
			driver.findElement(By.name("username")).clear();

		}
		bt.tearDown();
                                                    
		
	}

	
}
