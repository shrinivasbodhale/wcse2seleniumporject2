package xpath_Locator_Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_byusing_Index_P1 {

	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.flipkart.com/search?q=lipistic&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off");
		
		Thread.sleep(3000);
	    driver.findElement(By.xpath("(//div[.='Brand'])[2]")).click();
		WebElement Brand = driver.findElement(By.xpath("//div[.='Lakmé']/preceding-sibling::div[@class='_24_Dny']"));
		Brand.click();
	}

}
