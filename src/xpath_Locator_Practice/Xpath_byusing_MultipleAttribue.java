package xpath_Locator_Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_byusing_MultipleAttribue {

	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.flipkart.com/search?q=laptop&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off&as-pos=1&as-type=HISTORY");
		
		driver.findElement(By.xpath("//div[@class='_4rR01T' and (text()='Lenovo Lenovo IdeaPad Slim 3 Intel Core i3 11th Gen - (8 GB/256 GB SSD/Windows 11 Home) 15ITL05 Thin a...')]")).click();
		

		Thread.sleep(4000);
		driver.quit();
	}

}
