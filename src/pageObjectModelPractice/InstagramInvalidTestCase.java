package pageObjectModelPractice;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

public class InstagramInvalidTestCase extends BaseTest {

	public static void main(String[] args) throws IOException, EncryptedDocumentException, InterruptedException 
	{
		BaseTest bt = new BaseTest();
		bt.setup();
		Flib flib = new Flib();
		LoginPage lp = new LoginPage(driver);

		int rc = flib.rowCount(EXCEL_PATH, "invalidup");

		for (int i = 1; i <= rc; i++) 
		{
			lp.invalidLogin(flib.readExcelData(EXCEL_PATH, "invalidup", i, 0),
					flib.readExcelData(EXCEL_PATH, "invalidup", i, 1));

		}
		Thread.sleep(5000);
		bt.tearDown();
	}

}
