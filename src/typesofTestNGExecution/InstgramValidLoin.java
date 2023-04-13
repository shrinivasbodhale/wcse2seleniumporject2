package typesofTestNGExecution;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class InstgramValidLoin 
{
	static WebDriver driver;
	@Test
	@Parameters({ "browser", "url", "username", "password" })
	public void validLogin(String browser, String url, String username, String password) throws InterruptedException {
		if (browser.equalsIgnoreCase("chrome")) 
		{
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

			ChromeOptions co = new ChromeOptions();
			co.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(co);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get(url);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']")).sendKeys(username);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys(password);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-']")).click();
		} 
		else if (browser.equalsIgnoreCase("edge")) 
		{
			System.setProperty("webdriver.msedge.driver", "./drivers/edgedriver.exe");
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get(url);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']")).sendKeys(username);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys(password);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-']")).click();
		}
	}
	
	@AfterMethod
	public void close() 
	{
		driver.quit();
	}
}
