package keyword_Driven_Framework;

import java.io.IOException;

import org.openqa.selenium.By;

public class ActiTimeInvalidTestCase extends BaseTest {

	public static void main(String[] args) throws IOException, InterruptedException

	{
		BaseTest bt = new BaseTest();
		bt.setUp();

		Flib flib = new Flib();

		int rc = flib.rowCount("./data/ActiTimeTestData.xlsx", "invalidcreds");

		for (int i = 1; i <= rc; i++) 
		{
			String invalidusn = flib.readExcelData("./data/ActiTimeTestData.xlsx", "invalidcreds", i, 0);
			String invalidpwd = flib.readExcelData("./data/ActiTimeTestData.xlsx", "invalidcreds", i, 1);

			driver.findElement(By.name("username")).sendKeys(invalidusn);
			driver.findElement(By.name("pwd")).sendKeys(invalidpwd);
			driver.findElement(By.id("loginButton")).click();

			Thread.sleep(3000);
			driver.findElement(By.name("username")).clear();

		}
		bt.tearDown();

	}

}
