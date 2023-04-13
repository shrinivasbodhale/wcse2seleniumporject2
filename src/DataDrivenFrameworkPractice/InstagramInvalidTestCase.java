package DataDrivenFrameworkPractice;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class InstagramInvalidTestCase 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.instagram.com/");

		Flib flib = new Flib();
		int rc = flib.rowCount("./data/instagramtestdata.xlsx", "invalidup");

		for (int i = 0; i < rc; i++) 
		{
			String username = flib.readExcelData("./data/instagramtestdata.xlsx", "validup", i, 0);
			String password = flib.readExcelData("./data/instagramtestdata.xlsx", "validup", i, 1);

			Thread.sleep(1500);

			driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']")).sendKeys(username);
		
			driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys(password);
	
			driver.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-']")).click();

			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']")).clear();
			driver.findElement(By.xpath("//input[@aria-label='Password']")).clear();
		}
        Thread.sleep(5000);
        driver.close();
	}

}
