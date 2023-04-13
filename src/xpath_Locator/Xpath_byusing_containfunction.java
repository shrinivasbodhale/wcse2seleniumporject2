package xpath_Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_byusing_containfunction {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[contains(text(),'Forgotten password?')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[contains(@placeholder,'Email address or mobile number')]")).sendKeys("9834809511");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[contains(text(),'Search')]")).click();
		Thread.sleep(5000);

	}

}
