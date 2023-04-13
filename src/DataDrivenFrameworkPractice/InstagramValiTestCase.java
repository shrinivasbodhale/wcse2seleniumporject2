package DataDrivenFrameworkPractice;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class InstagramValiTestCase 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.instagram.com/");

		Flib flib = new Flib();
		String username = flib.readExcelData("./data/instagramtestdata.xlsx", "validup", 1, 0);
		String password = flib.readExcelData("./data/instagramtestdata.xlsx", "validup", 1, 1);
                         
		Thread.sleep(4000);

		driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']")).sendKeys(username);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-']")).click();

	}
}
