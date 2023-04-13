package pageObjectModelPractice;

import java.io.IOException;

public class InstagramValidloginTestCase extends BaseTest {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		BaseTest bt = new BaseTest();
		bt.setup();

		Flib flib = new Flib();

		LoginPage lp = new LoginPage(driver);
		lp.validLogin(flib.readPropertyData(PROP_PATH, "username"), flib.readPropertyData(PROP_PATH, "password"));

		Thread.sleep(4000);
		bt.tearDown();

	}

}
