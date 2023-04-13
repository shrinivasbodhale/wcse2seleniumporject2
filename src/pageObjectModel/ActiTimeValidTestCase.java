package pageObjectModel;

import java.io.IOException;

public class ActiTimeValidTestCase extends  BaseTest {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		BaseTest bt = new BaseTest();
		bt.setUp();
		Flib flib = new Flib();
		LoginPage lp = new LoginPage(driver);
		lp.validLogin(flib.readPropertyData(PROP_PATH, "username"),flib.readPropertyData(PROP_PATH, "password") );
		
		Thread.sleep(5000);
		bt.tearDown();
	
	}

}
