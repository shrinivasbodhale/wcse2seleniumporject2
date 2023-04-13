package keywordDrivenFrameworkPractice;

import java.io.IOException;

import org.openqa.selenium.By;

import keyword_Driven_Framework.Flib;

public class InstagramValidTestCase extends BaseTest {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		BaseTest bt = new BaseTest();
		bt.setup();

		Flib flib = new Flib();

		String username = flib.readPropertyData(PROP_PATH, "username");
		String password = flib.readPropertyData(PROP_PATH, "password");

		driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys(password);
		driver.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-']")).click();

		Thread.sleep(10000);
		bt.tearDown();
		
	}

}
