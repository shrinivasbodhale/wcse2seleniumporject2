package keywordDrivenFrameworkPractice;

import java.io.IOException;

import org.openqa.selenium.By;

import keyword_Driven_Framework.Flib;

public class InstagramInvalidTestCase extends BaseTest {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		BaseTest bt = new BaseTest();
		bt.setup();

		Flib flib = new Flib();

		int rc = flib.rowCount(EXCEL_PATH, "invalidup");
		

		for (int i = 1; i <=rc; i++) 
		{
			String username = flib.readExcelData(EXCEL_PATH, "invalidup", i, 0);
			String password = flib.readExcelData(EXCEL_PATH, "invalidup", i, 1);

			driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']")).sendKeys(username);
			driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys(password);
     		driver.findElement(By.xpath("(//div[.='Log in'])[1]")).click();
			
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']")).clear();
		}

		bt.tearDown();

	}

}
