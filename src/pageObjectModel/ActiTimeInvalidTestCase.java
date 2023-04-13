package pageObjectModel;

import java.io.IOException;

public class ActiTimeInvalidTestCase extends BaseTest {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		BaseTest bt = new BaseTest();
		bt.setUp();
		LoginPage lp = new LoginPage(driver);
		Flib flib = new Flib();
		int rc = flib.rowCount(EXCEL_PATH, "invalidCreds");

		for (int i = 1; i <= rc; i++) 
		{
			lp.invalidLogin(flib.readExcelData(EXCEL_PATH, "invalidcreds", i, 0),
					flib.readExcelData(EXCEL_PATH, "invalidcreds", i, 1));

		}
		Thread.sleep(5000);
		bt.tearDown();
	}

}
